package pl.sda.QuizForm_FinalProject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER_ANSWER")
@Data
@NoArgsConstructor
public class UserAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long userAnswerId;

    @Column
    public Long userId;

    @Column
    public Long questionId;

    @Column
    public Long answerId;
}
