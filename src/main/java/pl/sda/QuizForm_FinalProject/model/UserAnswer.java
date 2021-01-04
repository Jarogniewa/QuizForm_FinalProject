package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "QUIZ_USER_ANSWER")
@Data
@NoArgsConstructor
public class UserAnswer {

    @Id
    @GeneratedValue
    @Column
    public Long userAnswerId;

    @Column
    public Long question_id;

    @Column
    public Long answerId;
}
