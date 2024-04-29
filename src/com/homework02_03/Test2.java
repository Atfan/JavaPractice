package com.homework02_03;

import com.homework02_03.Book.Book;
import com.homework02_03.Car.Car;

public class Test2 {
    public static void main(String[] args) {
        Car car1 = new Car("Caddy","VW",2015);
        Car car2 = new Car("Cl120","M&B",2022, 2.4);

        car1.ShowCar();
        System.out.println("////////////////////////////////////////////////////");
        car2.ShowCar();
        System.out.println("////////////////////////////////////////////////////");
        Book book1 = new Book("Java Persistence with Hibernate, Second Edition",
                "Christian Bauer, Gavin King, and Gary Gregory", 2015,"Manning Publications",
                "Developing",608);
        book1.ShowBook();

    }
}
