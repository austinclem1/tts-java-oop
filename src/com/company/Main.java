package com.company;

public class Main {

    public static void main(String[] args) {
        Pet buffy = new Pet("Buffy", 4, "Nawlins", "Cat");
        buffy.setLocation("France");

        System.out.printf("name: %s\n", buffy.getName());
        System.out.printf("age: %d\n", buffy.getAge());
        // System.out.printf("location: %s\n", buffy.location);
        System.out.printf("type: %s\n", buffy.getType());

        Bass myBass = new Bass(5, "G&L", "Maple");
        System.out.println(myBass.commenceSlaps(5));
    }
}
