package pl.sda.QuizForm_FinalProject.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.QuizForm_FinalProject.dto.QuizDto;
import pl.sda.QuizForm_FinalProject.mapper.QuizMapper;
import pl.sda.QuizForm_FinalProject.model.Quiz;
import pl.sda.QuizForm_FinalProject.repository.QuizRepository;

@Service
@RequiredArgsConstructor
@Data
public class QuizService {

    private final QuizRepository quizRepository;
    private final QuizMapper quizMapper;

    public Long save(QuizDto quizDto) {
        Quiz quiz = quizMapper.map(quizDto);
        Quiz savedQuiz = quizRepository.save(quiz);
        return savedQuiz.getQuizId();
    }
}
