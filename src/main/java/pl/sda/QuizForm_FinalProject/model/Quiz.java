package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "QUIZ")
@Data
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue
    @Column(name = "QUIZ_ID")
    public String quizId;

    @Column
    public String title;

    @Column
    public String description;

    @Column
    public String question;

    @Column
    public Long answersIds;

    @Column
    public Long trueAnswerId;

    @Column
    public LocalDateTime creationDate;

    @Column
    public String link;

}
