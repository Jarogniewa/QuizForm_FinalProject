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
    @GeneratedValue
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
    public LocalDateTime creationDate;

    @Column
    public String link;
}
