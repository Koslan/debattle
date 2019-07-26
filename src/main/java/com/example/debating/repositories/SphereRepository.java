package  com.example.debating.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.debating.models.Sphere;

public interface SphereRepository extends JpaRepository<Sphere, Integer> {
	

}