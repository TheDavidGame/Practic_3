package com.Pract_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setR(15);
        System.out.println(c1.getR());
        c1.Radius(15);

        Human c2 = new Human();
        Human.Head c3 = c2.new Head();
        System.out.println(c3.getBrain());
        System.out.println(c2.getName());
        Human.Leg c4 = c2.new Leg();
        System.out.println(c4.getLeg_size());
    }
}

