package com.kpi.voting.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "mark")
public class Mark {

    // Id результату проходження тесту
    @Id
    @GeneratedValue
    private Long id;
    // Назва тесту
    private String title;
    // Оцінка студента
    private Long studentMark;
    // Максимальна оцінка за тест
    private Long maxMark;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Mark() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(Long studentMark) {
        this.studentMark = studentMark;
    }

    public Long getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(Long maxMark) {
        this.maxMark = maxMark;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", title=" + title + '\'' +
                ", studentMark=" + studentMark +
                ", maxMark=" + maxMark +
                '}';
    }
}



