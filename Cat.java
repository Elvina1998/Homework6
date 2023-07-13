package com.example.myapplication.cat;

import java.util.Objects;

public class Cat {

    private int age;
    private String name;
    private long passport;

    public Cat(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassport() {
        return passport;
    }

    public void setPassport(long passport) {
        this.passport = passport;
    }

    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name=" + name +
                ", passport=" + passport +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        if (this.name.equals((cat.getName())) && this.passport == cat.getPassport() && this.age == cat.getAge()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, passport);
    }
}
