package com.example.ForumHub.domain.repositorys;

import com.example.ForumHub.domain.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso,Long> {
}
