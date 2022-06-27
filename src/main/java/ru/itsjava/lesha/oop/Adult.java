package ru.itsjava.lesha.oop;

public class Adult extends Parent {

    public Adult(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.print("Adult: ");
        super.printName();
    }
}
