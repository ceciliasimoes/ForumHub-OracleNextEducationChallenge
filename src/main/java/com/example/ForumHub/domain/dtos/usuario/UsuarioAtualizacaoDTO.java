package com.example.ForumHub.domain.dtos.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioAtualizacaoDTO(
        String nome,

        String senha,

        @NotNull
        Long id
) {
}
