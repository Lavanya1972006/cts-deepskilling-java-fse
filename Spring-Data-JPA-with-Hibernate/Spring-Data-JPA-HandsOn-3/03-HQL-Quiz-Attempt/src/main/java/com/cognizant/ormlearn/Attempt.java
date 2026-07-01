package com.cognizant.ormlearn;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "attempt")
public class Attempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "at_id")
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "at_attempted_date")
    private Date attemptedDate;

    @ManyToOne
    @JoinColumn(name = "at_us_id")
    private User user;

    @OneToMany(mappedBy = "attempt")
    private List<AttemptQuestion> attemptQuestions;

    public Attempt() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAttemptedDate() {
        return attemptedDate;
    }

    public void setAttemptedDate(Date attemptedDate) {
        this.attemptedDate = attemptedDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<AttemptQuestion> getAttemptQuestions() {
        return attemptQuestions;
    }

    public void setAttemptQuestions(List<AttemptQuestion> attemptQuestions) {
        this.attemptQuestions = attemptQuestions;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "id=" + id +
                ", attemptedDate=" + attemptedDate +
                '}';
    }
}