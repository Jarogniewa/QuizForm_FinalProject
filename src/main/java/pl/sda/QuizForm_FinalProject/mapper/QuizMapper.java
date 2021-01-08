package pl.sda.QuizForm_FinalProject.mapper;

import org.mapstruct.Mapper;
import pl.sda.QuizForm_FinalProject.dto.QuizDto;
import pl.sda.QuizForm_FinalProject.model.Quiz;

@Mapper
public interface QuizMapper {

    Quiz map(QuizDto quizDto);

}
