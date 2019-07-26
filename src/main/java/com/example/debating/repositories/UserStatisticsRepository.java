package  com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.UserStatistics;

public interface UserStatisticsRepository extends JpaRepository<UserStatistics, Integer>{

}
