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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUESTION_ID")
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    public QuestionType questionType;

    @Column(name = "POLL_ID")
    public Long PollId;

    @Column(name = "QUIZ_ID")
    public Long QuizId;

    @Column
    public String content;

    @Column
    public int scorePoints;

    @OneToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "ANSWER",
            joinColumns = { @JoinColumn( name = "QUESTION_ID") }
    )
    private List<Answer> answers;

}
