package pl.sda.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "QUIZ")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class QuizEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUIZ_ID")
    public Long quizId;

    @Column
    public String title;

    @Column
    public String description;

    @OneToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "QUESTION",
            joinColumns = { @JoinColumn( name = "QUIZ_ID") }
//            ,
//            inverseJoinColumns = { @JoinColumn(name = "QUESTION_ID") }
    )
    public List<QuestionEntity> questions;

//    @Column
//    public Long answersIds;
//
//    @Column
//    public Long trueAnswerId;

    @Column(columnDefinition = "TIMESTAMP")
    //@Temporal(TemporalType.TIME)
    public LocalDateTime creationDate;

    @Column
    public String link;

}
