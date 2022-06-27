package ru.itsjava.lesha.oop;

public class Parent {
    private String name;

    public Parent() {
        System.out.println("Constr parent");
    }

    public Parent(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}