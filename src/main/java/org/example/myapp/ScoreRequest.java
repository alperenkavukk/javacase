package org.example.myapp;

public class ScoreRequest {
    private Long userId;
    private int points;

    // Getter ve Setter metodları
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
