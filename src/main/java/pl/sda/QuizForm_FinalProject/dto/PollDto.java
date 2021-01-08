package pl.sda.QuizForm_FinalProject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.QuizForm_FinalProject.model.Question;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class PollDto {

    public Long pollId;
    public String title;
    public String description;
    public List<Question> questions;
//    public String answers;
    public LocalDateTime creationDate;
    public String link;

}
