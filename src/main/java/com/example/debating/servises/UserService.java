package com.example.debating.servises;

import java.util.Optional;

import com.example.debating.models.User;

public interface UserService {
	void save(User user);

	Optional<User> findByLogin(String login);
}