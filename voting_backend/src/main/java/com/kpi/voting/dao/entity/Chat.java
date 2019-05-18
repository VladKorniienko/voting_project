package com.kpi.voting.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chat")
public class Chat {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String groupName;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Message> messages;

    public Chat () {
        messages = new ArrayList<Message>();
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", messages=" + messages +
                '}';
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
