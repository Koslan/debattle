package  com.example.debating.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.User;

public interface UserRepository extends JpaRepository<User, Integer>  {
    Optional<User> findByLogin(String login);
    User findUserById(Integer id);
}
