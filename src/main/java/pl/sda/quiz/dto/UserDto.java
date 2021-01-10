package pl.sda.quiz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

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
