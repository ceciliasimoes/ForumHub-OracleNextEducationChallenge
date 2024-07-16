package com.example.ForumHub.domain.dtos.usuario;

import com.example.ForumHub.domain.models.Usuario;

public record UsuarioDTO(
        Long id,
        String email
) {
    public UsuarioDTO(Usuario autor) {
        this(autor.getId(),autor.getEmail());
    }
}
