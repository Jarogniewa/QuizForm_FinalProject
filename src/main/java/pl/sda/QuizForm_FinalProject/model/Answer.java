package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.QuizForm_FinalProject.model.enums.AnswerCorrectness;

import javax.persistence.*;

@Entity
@Table(name = "ANSWER")
@Data
@NoArgsConstructor
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANSWER_ID")
    public Long answerId;

    @Column(name = "QUESTION_ID")
    public Long questionId;

    @Column
    public String content;

    @Column
    @Enumerated(EnumType.STRING)
    public AnswerCorrectness correctness;

}
