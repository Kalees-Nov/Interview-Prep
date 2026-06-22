package org.example;

import org.example.Oops.Encapsulation;
import org.example.Oops.Polymorphisum;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Back King");

        Encapsulation e = new Encapsulation();

        int result = e.getPolymorphisum().add(10,20);
        float resultf = e.getPolymorphisum().add(20,5,4);

        System.out.println("result " + result + "," + "resultf " + resultf);
            //e.setAge(0);
        }




}