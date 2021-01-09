package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "POLL")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Poll {

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
    public List<Question> questions;

//    @Column
//    public String answers;

    @Column
    @Temporal(TemporalType.DATE)
    public Date creationDate;

    @Column
    public String link;
}
