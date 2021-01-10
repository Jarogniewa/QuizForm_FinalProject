package pl.sda.quiz.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "POLL")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PollEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POLL_ID")
    public Long pollId;

    @Column
    public String title;

    @Column
    public String description;

    @OneToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "QUESTION",
            joinColumns = { @JoinColumn( name = "POLL_ID") }
            )
    public List<QuestionEntity> questions;

//    @Column
//    public String answers;

    @Column(columnDefinition = "TIMESTAMP")
    //@Temporal(TemporalType.DATE)
    public LocalDateTime creationDate;

    @Column
    public String link;
}
