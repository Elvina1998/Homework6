package com.example.myapplication.cat;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурчик");
        cat1.setAge(5);
        cat1.setPassport(123456789);

        Cat cat2 = new Cat("Оливер");
        Cat cat3 = new Cat("Оливер");
        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        System.out.println(cat2.equals(cat3)); // true
    }
}
