package pl.sda.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.quiz.model.QuizEntity;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<QuizEntity, Long> {

    List<QuizEntity> findAll();

}
