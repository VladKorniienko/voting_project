package com.kpi.voting.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test")
public class Test {
    // Id тесту
    @Id
    @GeneratedValue
    private Long id;
    // Питання до тесту
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Question> questions;
    // Назва тесту
    @Column
    private String title;
    //Назва предмету
    @Column
    private String subject;

    // Максимальна оцінка за тест
    @Column
    private double maxMark;

    public Test() {
        questions = new ArrayList<Question>();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getMaxMark() {
        return maxMark;
    }
    public void setMaxMark(double maxMark) {
        this.maxMark = maxMark;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", questions=" + questions +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", maxMark=" + maxMark +
                '}';
    }


}

