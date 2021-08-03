package com.xinyuan.iBatis.pojo;

public class StudentFull {
    private int ID;
    private String NAME;
    private int SCORE;

    public StudentFull(int ID, String NAME, int SCORE) {
        this.ID = ID;
        this.NAME = NAME;
        this.SCORE = SCORE;
    }

    public StudentFull() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getSCORE() {
        return SCORE;
    }

    public void setSCORE(int SCORE) {
        this.SCORE = SCORE;
    }

    @Override
    public String toString() {
        return "StudentFull{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", SCORE=" + SCORE +
                '}';
    }
}
