package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "QUIZ_ANS")
@Data
@NoArgsConstructor
public class QuizAnswer {

    @Id
    @GeneratedValue
    @Column(name = "ANSWER_ID")
    public Long answerId;

    @Column(name = "QUESTION_ID")
    public Long questionId;

    @Column
    public String content;

    @Column
    public boolean correctness;

}
