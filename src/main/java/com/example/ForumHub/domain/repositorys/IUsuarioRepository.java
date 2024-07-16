package com.example.ForumHub.domain.repositorys;

import com.example.ForumHub.domain.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository  extends JpaRepository<Usuario,Long> {
    Usuario findByEmail(String email);
}
