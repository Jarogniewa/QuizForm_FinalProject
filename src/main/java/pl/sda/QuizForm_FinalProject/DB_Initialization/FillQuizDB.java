package pl.sda.QuizForm_FinalProject.DB_Initialization;

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

    private QuizRepository quizRepository;

    @Override
    public void run(String... args) throws Exception{
        quizRepository.save(Quiz.builder()
        .title("Test quiz 1")
        .description("This is description of Test quiz 1")
        .link("12345678")
        .build());
    }

}
