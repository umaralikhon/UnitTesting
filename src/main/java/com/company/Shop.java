package com.company;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Car> cars = new ArrayList<>();
    private List<Motorcycle> motorcycles = new ArrayList<>();

    @Bean
    public void addItems() {
        this.cars.add(new Car("BMW", "Black", 2022, 500, "Tashkent"));
        this.cars.add(new Car("Mercedes", "White", 2022, 500, "Tashkent"));
        this.motorcycles.add(new Motorcycle("BMW", 50000, 200));
        this.motorcycles.add(new Motorcycle("BMW", 45000, 200));
        this.motorcycles.add(new Motorcycle("Acura", 60000, 200));
        this.motorcycles.add(new Motorcycle("Mitsubishi", 40000, 200));
        this.motorcycles.add(new Motorcycle("Dasuka", 55000, 200));
        this.motorcycles.add(new Motorcycle("Yamaha", 45000, 200));

    }

    public List<Car> showCarList() {
        if(cars.isEmpty()) {
            return null;
        }
        return this.cars;
    }

    public List<Motorcycle> showMotorcycles() {
        if(motorcycles.isEmpty()){
            return null;
        }
        return this.motorcycles;
    }

    public void sortMotorcycleByPrice(int price){
        for(Motorcycle cycle: motorcycles){
            if(cycle.getPrice() < price){
                System.out.println(cycle);
            }
        }
    }
}
