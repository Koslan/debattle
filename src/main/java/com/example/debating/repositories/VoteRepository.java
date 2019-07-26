package  com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.debating.models.Vote;

public interface VoteRepository extends JpaRepository<Vote, Integer>  {

}