package com.example.ForumHub.domain.services;

import com.example.ForumHub.domain.dtos.topico.TopicoAtualizacaoDTO;
import com.example.ForumHub.domain.dtos.topico.TopicoCadastroDTO;
import com.example.ForumHub.domain.dtos.topico.TopicoDTO;
import com.example.ForumHub.domain.exceptions.TopicoCantBeDelete;
import com.example.ForumHub.domain.exceptions.TopicoNotFoundException;
import com.example.ForumHub.domain.exceptions.UsuarioNotFoundException;
import com.example.ForumHub.domain.models.Topico;
import com.example.ForumHub.domain.repositorys.ICursoRepository;
import com.example.ForumHub.domain.repositorys.ITopicoRepository;
import com.example.ForumHub.domain.repositorys.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicosService {
    @Autowired
    private ITopicoRepository topicoRepository;

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Autowired
    private ICursoRepository cursoRepository;

    @Transactional
    public TopicoDTO salvarTopico(TopicoCadastroDTO dto) {
        Topico topico = new Topico(dto);
        topico.setAutor(this.usuarioRepository.getReferenceById(dto.autor().id()));
        topico.setCurso(this.cursoRepository.getReferenceById(dto.curso().id()));
        this.topicoRepository.save(topico);
        TopicoDTO topicoDTO = new TopicoDTO(topico);
        return topicoDTO;
    }

    public List<TopicoDTO> listarTopicos() {
        return this.topicoRepository.findAll().stream()
                .map(TopicoDTO::new).collect(Collectors.toList());
    }

    public TopicoDTO buscarTopico(Long id) {
        var topico = this.topicoRepository.findById(id).orElseThrow(()-> new UsuarioNotFoundException("Usuario não encontrado!"));
        TopicoDTO topicoDTO = new TopicoDTO(topico);
        return topicoDTO;
    }

    @Transactional
    public TopicoDTO atualizarTopico(TopicoAtualizacaoDTO dto) {
        Topico topico = this.topicoRepository.findById(dto.id())
                .orElseThrow(() -> new TopicoNotFoundException("O tópico não foi encontrado, por isso não é possível realizar as alterações!"));

        if (dto.status() != null) {
            topico.setStatus(dto.status());
        }
        if (dto.mensagem() != null) {
            topico.setMensagem(dto.mensagem());
        }
        topico.setDataAtualizacao(dto.data());

        this.topicoRepository.save(topico);

        TopicoDTO topicoDTO = new TopicoDTO(topico);

        return topicoDTO;
    }

    @Transactional
    public void deletarTopico(Long id) {
        buscarTopico(id);
        try {
            this.topicoRepository.deleteById(id);

        } catch (Exception e) {
            throw new TopicoCantBeDelete("O tópico não pode ser removido!");
        }
    }
}
