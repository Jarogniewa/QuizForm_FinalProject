package pl.sda.quiz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.quiz.model.QuestionEntity;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class PollDto {

    public Long pollId;
    public String title;
    public String description;
    public List<QuestionEntity> questions;
//    public String answers;
    public LocalDateTime creationDate;
    public String link;

}
