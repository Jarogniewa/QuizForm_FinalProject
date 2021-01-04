package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUIZ_QUEST")
@Data
@NoArgsConstructor
public class QuizQuestion {

    @Id
    @GeneratedValue
    @Column(name = "QUESTION_ID")
    private Long id;

    @Column
    public String content;

    @Column
    public int points;

    @OneToMany
    @JoinTable(
            name = "answers",
            joinColumns =  { @JoinColumn(name = "QUESTION_ID")}
    )
    private List<QuizAnswer> answers;

}
