package pl.sda.QuizForm_FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.QuizForm_FinalProject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
