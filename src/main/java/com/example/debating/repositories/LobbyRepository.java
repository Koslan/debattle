package com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.Lobby;

public interface LobbyRepository extends JpaRepository<Lobby, Integer> {

}
