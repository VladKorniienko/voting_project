package com.kpi.voting.dao.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "question")
public class Question {

    // Іd питання
    @Id
    @GeneratedValue
    private Long id;
    // Запитання
    @Column
    private String text;
    // Варіанти відповіді
    @Column
    private String[] questions;
    // Відповіді
    @Column
    private boolean[] answers;
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;


    public Question() {

    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", questions=" + Arrays.toString(questions) +
                ", answers=" + Arrays.toString(answers) +
                ", test=" + test +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public boolean[] getAnswers() {
        return answers;
    }

    public void setAnswers(boolean[] answers) {
        this.answers = answers;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

}
