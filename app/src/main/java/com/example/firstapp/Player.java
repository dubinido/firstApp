package com.example.firstapp;

public class Player {
    private String name;
    private String stage; //the user stage in the bist
    private boolean come;
    private int level;

    public Player(String nam, String sta) {
        this.name = nam;
        this.stage = sta;
    }

    public String getName() {
        return name;
    }

    public String getStage() {
        return stage;
    }

    public boolean isCome() {
        return come;
    }

    public int getLevel() {
        return level;
    }


}
