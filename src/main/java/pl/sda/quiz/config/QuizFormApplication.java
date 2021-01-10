package pl.sda.quiz.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("pl.sda.quiz")
@EntityScan("pl.sda.quiz.model")
@EnableJpaRepositories("pl.sda.quiz.repository")
//@Import(SecurityConfig.class)
public class QuizFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizFormApplication.class, args);
	}

}
