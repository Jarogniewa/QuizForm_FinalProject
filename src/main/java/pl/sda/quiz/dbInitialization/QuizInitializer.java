package pl.sda.quiz.dbInitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import pl.sda.quiz.model.QuizEntity;
import pl.sda.quiz.repository.QuizRepository;

import java.time.LocalDateTime;

@Configuration
public class QuizInitializer
        implements CommandLineRunner
{

    @Autowired
    public QuizRepository quizRepository;

    @Override
    public void run(String... args) throws Exception {
        createQuiz(1L, "Test quiz 1", "This is description of Test quiz 1", "12345678");
        createQuiz(2L, "Test quiz 2", "This is description of Test quiz 2", "90123456");
    }

    private void createQuiz(long id, String title, String description, String link) {
        QuizEntity quiz = QuizEntity.builder()
                        .quizId(id)
                        .creationDate(LocalDateTime.now())
                        .title(title)
                        .description(description)
                        .link(link)
                        .build();
        quizRepository.save(quiz);
    }

}
