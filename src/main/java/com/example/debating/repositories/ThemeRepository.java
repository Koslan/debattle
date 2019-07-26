package com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.debating.models.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Integer>{

}
