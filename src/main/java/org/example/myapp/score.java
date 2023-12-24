package org.example.myapp;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "score")
public class score {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private int points;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public String getUser(String user) {
        return user;
    }
    public int getPoints(int points) {
        return points;
    }

    public void setUser(User user) {
       this.user = user;
    }
    public void setPoints(User user) {
        this.points = points;
    }
}
