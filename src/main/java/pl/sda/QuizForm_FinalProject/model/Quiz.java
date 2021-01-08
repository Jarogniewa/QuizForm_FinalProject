package pl.sda.QuizForm_FinalProject.model;

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
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUIZ_ID")
    public Long quizId;

    @Column
    public String title;

    @Column
    public String description;

    @OneToMany(mappedBy = "QUIZ_ID")
    public List<Question> questions;

//    @Column
//    public Long answersIds;
//
//    @Column
//    public Long trueAnswerId;

    @Column
    @Temporal(TemporalType.DATE)
    public LocalDateTime creationDate;

    @Column
    public String link;

}
