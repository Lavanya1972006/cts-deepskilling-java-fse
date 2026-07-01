package com.cognizant.ormlearn;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "options")
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "op_id")
    private int id;

    @Column(name = "op_text")
    private String text;

    @Column(name = "op_score")
    private double score;

    @Column(name = "op_correct")
    private boolean correct;

    @ManyToOne
    @JoinColumn(name = "op_qt_id")
    private Question question;

    @OneToMany(mappedBy = "option")
    private List<AttemptOption> attemptOptions;

    public Options() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }


    public List<AttemptOption> getAttemptOptions() {
        return attemptOptions;
    }

    public void setAttemptOptions(List<AttemptOption> attemptOptions) {
        this.attemptOptions = attemptOptions;
    }

    @Override
    public String toString() {
        return "Options{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", score=" + score +
                ", correct=" + correct +
                '}';
    }
}