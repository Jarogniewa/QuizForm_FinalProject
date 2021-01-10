package pl.sda.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.quiz.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
