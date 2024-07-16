package com.example.ForumHub.domain.dtos.topico;

import com.example.ForumHub.domain.dtos.curso.CursoDTO;
import com.example.ForumHub.domain.dtos.usuario.UsuarioDTO;
import com.example.ForumHub.domain.models.Topico;


import java.time.LocalDateTime;

public record TopicoDTO(
        Long id,
        String titulo,
        String mensagem,
        UsuarioDTO autor,
        LocalDateTime data,
        String status,
        CursoDTO curso
) {
    public TopicoDTO(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), new UsuarioDTO(topico.getAutor()), topico.getDataCriacao(), topico.getStatus(), new CursoDTO(topico.getCurso()));
    }
}
