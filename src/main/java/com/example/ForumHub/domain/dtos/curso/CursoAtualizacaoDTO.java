package com.example.ForumHub.domain.dtos.curso;

import jakarta.validation.constraints.NotNull;

public record CursoAtualizacaoDTO(
        String nome,
        String categoria,
        @NotNull
        Long id
) {
}
