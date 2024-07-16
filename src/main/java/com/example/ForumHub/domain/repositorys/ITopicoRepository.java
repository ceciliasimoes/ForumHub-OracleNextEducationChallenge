package com.example.ForumHub.domain.repositorys;

import com.example.ForumHub.domain.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopicoRepository extends JpaRepository<Topico,Long> {
}
