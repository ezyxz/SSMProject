package com.xinyuan.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("getIdDaoAnno")
public class IdDaoAnno implements IdDao{
    @Value("10")
    private int id;
    @Value("20")
    private int number;

    public IdDaoAnno() {
    }

    public IdDaoAnno(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "IdDaoAnno{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
