package pl.sda.QuizForm_FinalProject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class PollDto {

    public Long pollId;
    public String title;
    public String description;
    public String questions;
    public String answers;
    public LocalDateTime creationDate;
    public String link;

}
