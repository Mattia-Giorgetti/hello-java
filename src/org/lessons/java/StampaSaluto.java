package org.lessons.java;

public class StampaSaluto {
    public static void main(String[] args) {
        String name = "Mattia";
        String surname = "Giorgetti";
        String fullname = name + " " + surname;
        int age = 32;
        System.out.println("Hello Java!");
        System.out.println("My name is" + " " + fullname);
        System.out.println(String.format("I'm %s years old", age));
        System.out.println("Sto provando a pushare con il terminale");
    }
}
