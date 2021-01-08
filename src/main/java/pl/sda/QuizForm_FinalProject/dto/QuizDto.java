package pl.sda.QuizForm_FinalProject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.QuizForm_FinalProject.model.Question;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class QuizDto {

    public Long quizId;
    public String title;
    public String description;
    public List<Question> questions;
//    public Long answersIds;
//    public Long trueAnswerId;
    public LocalDateTime creationDate;
    public String link;

}
