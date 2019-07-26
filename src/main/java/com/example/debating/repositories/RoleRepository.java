package com.example.debating.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	List<Role> findAllById(Set<Long> singleton);

}