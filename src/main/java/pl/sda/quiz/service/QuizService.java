package pl.sda.quiz.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.quiz.dto.QuizDto;
import pl.sda.quiz.mapper.QuizMapper;
import pl.sda.quiz.model.QuizEntity;
import pl.sda.quiz.repository.QuizRepository;

@Service
@RequiredArgsConstructor
@Data
public class QuizService {

    private final QuizRepository quizRepository;
    private final QuizMapper quizMapper;

    public Long save(QuizDto quizDto) {
        QuizEntity quiz = quizMapper.map(quizDto);
        QuizEntity savedQuiz = quizRepository.save(quiz);
        return savedQuiz.getQuizId();
    }
}
