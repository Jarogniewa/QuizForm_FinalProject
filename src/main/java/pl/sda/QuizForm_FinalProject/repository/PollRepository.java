package pl.sda.QuizForm_FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.QuizForm_FinalProject.model.Poll;

import java.util.List;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long>{

    List<Poll> findAll();

}
