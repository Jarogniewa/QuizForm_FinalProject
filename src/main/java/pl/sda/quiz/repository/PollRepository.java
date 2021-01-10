package pl.sda.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.quiz.model.PollEntity;

import java.util.List;

@Repository
public interface PollRepository extends JpaRepository<PollEntity, Long>{

    List<PollEntity> findAll();

}
