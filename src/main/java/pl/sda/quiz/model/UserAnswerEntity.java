package pl.sda.quiz.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "USER_ANSWER")
@Data
@NoArgsConstructor
public class UserAnswerEntity {

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
