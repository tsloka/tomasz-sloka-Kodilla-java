package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        System.out.println("First unit test:");
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Second unit test:");

        Calculator calculator = new Calculator();
        if (calculator.addAtoB(84, 56) == 140) {
            System.out.println("Summation ok");
        } else {
            System.out.println("Error!");
        }
        if (calculator.subtractBfromA(84, 56) == 28) {
            System.out.println("Subtraction ok");
        } else {
            System.out.println("Error!");
        }
    }
}
