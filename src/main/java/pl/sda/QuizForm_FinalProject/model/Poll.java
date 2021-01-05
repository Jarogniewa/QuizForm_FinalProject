package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "POLL")
@Data
@NoArgsConstructor
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POLL_ID")
    public Long pollId;

    @Column
    public String title;

    @Column
    public String description;

    @Column
    public String questions;

    @Column
    public String answers;

    @Column
    @Temporal(TemporalType.DATE)
    public LocalDateTime creationDate;

    @Column
    public String link;
}
