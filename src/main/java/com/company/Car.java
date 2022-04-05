package com.company;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class Car {

    @Getter
    private String model;

    @Setter
    @Getter
    private String color;

    @Getter
    private int year;

    @Setter
    @Getter
    private int horses;

    @Getter
    private String diler;

    @Getter
    private List<String> dilers = new ArrayList<>();

    public Car(String model, String color, int year, int horses, String diler){
        this.model = model;
        this.color = color;
        this.year = year;
        this.horses = horses;
        this.diler = diler;
        this.dilers.add(diler);
    }

    public void setDiler(String diler){
        this.diler = diler;
        dilers.add(diler);

    }
}
