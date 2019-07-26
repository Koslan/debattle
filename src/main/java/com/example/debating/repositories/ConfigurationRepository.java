package com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration, Integer>{

}
