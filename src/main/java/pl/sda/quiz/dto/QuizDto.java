package pl.sda.quiz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.quiz.model.QuestionEntity;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class QuizDto {

    public Long quizId;
    public String title;
    public String description;
    public List<QuestionEntity> questions;
//    public Long answersIds;
//    public Long trueAnswerId;
    public LocalDateTime creationDate;
    public String link;

}
