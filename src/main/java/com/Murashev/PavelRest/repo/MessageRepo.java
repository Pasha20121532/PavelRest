package com.Murashev.PavelRest.repo;

import com.Murashev.PavelRest.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}

