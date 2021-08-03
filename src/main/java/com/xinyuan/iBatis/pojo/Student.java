package com.xinyuan.iBatis.pojo;

import org.apache.ibatis.type.Alias;

@Alias("student")
public class Student {
    private int ID;
    private String NAME;
    private int NUMBER;

    public Student() {
    }

    public Student(int ID, String NAME, int NUMBER) {
        this.ID = ID;
        this.NAME = NAME;
        this.NUMBER = NUMBER;
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

    public int getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(int NUMBER) {
        this.NUMBER = NUMBER;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", NUMBER=" + NUMBER +
                '}';
    }
}
