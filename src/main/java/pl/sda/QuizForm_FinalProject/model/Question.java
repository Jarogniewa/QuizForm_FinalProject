package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTION")
@Data
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "QUESTION_ID")
    private Long id;

    @Column
    public QuestionType questionType;

    @Column
    public String content;

    @Column
    public int scorePoints;

    @OneToMany
    @JoinTable(
            name = "answers",
            joinColumns =  @JoinColumn(name = "QUESTION_ID")
    )
    private List<Answer> answers;

}
