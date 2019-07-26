package com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.LobbyStatistics;

public interface LobbyStatisticsRepository extends JpaRepository<LobbyStatistics, Integer>{

}
