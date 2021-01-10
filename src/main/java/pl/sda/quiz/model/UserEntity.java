package pl.sda.quiz.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    public Long userId;

    @Column
    public String firstName;

    @Column
    public String lastName;

    @Column
    public String email;

    @Column
    public Long takenQuizId;

    @Column
    public int gainedScore;

    @Column
    public int maximumScore;

}
