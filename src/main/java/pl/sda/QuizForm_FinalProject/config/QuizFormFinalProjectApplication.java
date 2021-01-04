package pl.sda.QuizForm_FinalProject.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("pl.sda")
@EntityScan("pl.sda.final_project.model")
@EnableJpaRepositories("pl.sda.QuizForm_FinalProject.repository")
//@Import(SecurityConfig.class)
public class QuizFormFinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizFormFinalProjectApplication.class, args);
	}

}
