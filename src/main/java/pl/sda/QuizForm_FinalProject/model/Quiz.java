package pl.sda.QuizForm_FinalProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "QUIZ")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Quiz {

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
    )
    public List<Question> questions;

//    @Column
//    public Long answersIds;
//
//    @Column
//    public Long trueAnswerId;

    @Column
    @Temporal(TemporalType.DATE)
    public Date creationDate;

    @Column
    public String link;

}
