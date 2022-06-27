package ru.itsjava.lesha.oop;

public class Child extends Parent {

    public Child() {
        System.out.println("Constr child");
    }

    public Child(String nickname) {
        super(nickname);
    }

    public void printChild() {
        System.out.println("CHIIILD");
    }

    @Override
    public void printName() {
        System.out.print("Nickname: ");
        super.printName();
    }
}