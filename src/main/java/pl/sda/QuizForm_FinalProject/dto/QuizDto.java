package pl.sda.QuizForm_FinalProject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class QuizDto {

    public Long quizId;
    public String title;
    public String description;
    public String question;
    public Long answersIds;
    public Long trueAnswerId;
    public LocalDateTime creationDate;
    public String link;

}
