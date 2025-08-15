package com.fruits;
import java.util.Scanner;
public class fruits {
    public static void main(String[] args) {
        Scanner yaya = new Scanner(System.in);
        System.out.println("Which fruit do you want to describe : ");
        String fruit = yaya.nextLine();
        switch ( fruit ) {
            case "Mango", "mango" -> System.out.println("king of fruits");
            case "Apple", "apple" -> System.out.println("Sweet fruit");
            case "Grape", "grape" -> System.out.println("round fruit");
            case "pomegranate", "Pomegranate" -> System.out.println("Fruit for blood circulation");
            default -> System.out.println("invalid");
        }

    }
}
