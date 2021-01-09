package pl.sda.QuizForm_FinalProject.DB_Initialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import pl.sda.QuizForm_FinalProject.model.Quiz;
import pl.sda.QuizForm_FinalProject.repository.QuizRepository;

import java.sql.Date;
import java.time.LocalDateTime;

@Configuration
public class FillQuizDB
        implements CommandLineRunner
{

    @Autowired
    public QuizRepository quizRepository;

    @Override
    public void run(String... args) throws Exception{
        quizRepository.save(Quiz.builder()
                .quizId(1L)
                .creationDate(LocalDateTime.now())
                .title("Test quiz 1")
                .description("This is description of Test quiz 1")
                .link("12345678")
                .build());

        quizRepository.save(Quiz.builder()
                .quizId(2L)
                .creationDate(LocalDateTime.now())
                .title("Test quiz 2")
                .description("This is description of Test quiz 2")
                .link("90123456")
                .build());
    }

}
