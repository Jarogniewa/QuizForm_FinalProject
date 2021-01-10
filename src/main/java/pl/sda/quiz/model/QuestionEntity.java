package pl.sda.quiz.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.quiz.model.enums.QuestionType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUESTION")
@Data
@NoArgsConstructor
public class QuestionEntity {

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
    private List<AnswerEntity> answerEntities;

//    @ManyToOne(cascade = { CascadeType.ALL}))
//    @JoinTable(
//            name = "QUIZ",
//            joinColumns = { @JoinColumn ( name = "QUESTION_ID") }
//    )

}
