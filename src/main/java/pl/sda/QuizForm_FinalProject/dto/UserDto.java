package pl.sda.QuizForm_FinalProject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
public class UserDto {

    public Long userId;
    public String firstName;
    public String lastName;
    public String email;
    public Long takenQuizId;
    public int gainedScore;
    public int maximumScore;

}
