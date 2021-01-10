package pl.sda.quiz.mapper;

import org.mapstruct.Mapper;
import pl.sda.quiz.dto.QuizDto;
import pl.sda.quiz.model.QuizEntity;

@Mapper
public interface QuizMapper {

    QuizEntity map(QuizDto quizDto);

}
