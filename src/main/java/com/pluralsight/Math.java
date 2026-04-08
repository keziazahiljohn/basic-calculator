package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int answer;

        System.out.print("Enter the first number: ");
        int x = myScanner.nextInt();

        System.out.print                              ("Enter the second number: ");
        int y = myScanner.nextInt();
        System.out.println("Possible calculations:");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");

        System.out.print("Please select an option: ");
        myScanner.nextLine();
        String o = myScanner.nextLine();

        if (Objects.equals(o, "A")) {
            answer = x + y;
            System.out.println(x + " + " + y + " = " + answer);
        } else if (Objects.equals(o, "S")) {
            answer = x - y;
            System.out.println(x + " - " + y + " = " + answer);
        } else if (Objects.equals(o, "M")) {
            answer = x * y;
            System.out.println(x + " * " + y + " = " + answer);
        } else if (Objects.equals(o, "D")) {
            answer = x / y;
            System.out.println(x + " / " + y + " = " + answer);
        }


    }

}
