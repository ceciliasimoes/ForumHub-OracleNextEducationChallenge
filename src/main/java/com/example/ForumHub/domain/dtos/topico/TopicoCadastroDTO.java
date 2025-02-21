package com.example.ForumHub.domain.dtos.topico;

import com.example.ForumHub.domain.dtos.curso.CursoDTO;
import com.example.ForumHub.domain.dtos.usuario.UsuarioDTO;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record TopicoCadastroDTO(
        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

        @NotNull
        UsuarioDTO autor,

        @NotNull
        @Future  //tem q ser uma data no futuro
        LocalDateTime data,

        @NotBlank
        String status,

        @NotNull
        CursoDTO curso
) {
}
