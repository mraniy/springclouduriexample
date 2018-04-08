package com.example.sportgameservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SportGame {
    public SportGame(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public SportGame() {

    }

    @Id
    @GeneratedValue
    private Long id;

    private String team1;

    private String team2;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }
}