package pl.sda.QuizForm_FinalProject.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class FormQuestion {


    @Id
    @GeneratedValue
    private int id;

    public String content;
    public int points;
    public String[] answers;
}
