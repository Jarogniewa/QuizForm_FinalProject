package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    public Long userId;

    @Column
    public String name;

    @Column
    public int gainedScore;

    @Column
    public int maximumScore;

}
