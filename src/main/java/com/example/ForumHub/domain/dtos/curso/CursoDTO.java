package com.example.ForumHub.domain.dtos.curso;


import com.example.ForumHub.domain.models.Curso;

public record CursoDTO(
        String nome,
        Long id,
        String categoria
) {
    public CursoDTO(Curso curso) {
        this(curso.getNome(),curso.getId(), curso.getCategoria());
    }
}
