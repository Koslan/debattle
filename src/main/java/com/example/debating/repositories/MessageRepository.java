package com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}
