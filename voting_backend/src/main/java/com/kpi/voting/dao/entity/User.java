package com.kpi.voting.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    // Id користувача
    @Id
    @GeneratedValue
    private Long id;
    // Ім'я
    @Column
    private String name;
    // email
    @Column
    private String email;
    //Пароль
    @Column
    private String password;
    //Група
    @Column
    private String groupName;
    //Предмет(якщо вчитель)
    @Column
    private String subject;
    // Студент чи викладач
    @Column
    private boolean teacher;
    // Результати проходження тестів
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Mark> marks;


    public User() {
        marks = new ArrayList<Mark>();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTeacher() {
        return teacher;
    }

    public void setTeacher(boolean teacher) {
        this.teacher = teacher;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", groupName='" + groupName + '\'' +
                ", subject='" + subject + '\'' +
                ", teacher=" + teacher +
                ", marks=" + marks +
                '}';
    }





}
