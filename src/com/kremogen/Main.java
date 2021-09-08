package com.kremogen;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Собака", "Вася");

        System.out.print("Имя собаки: " + dog1.getName() + "\nИмя владельца: " + dog1.getDogOwner());
    }
}
