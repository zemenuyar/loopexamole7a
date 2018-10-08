package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the number");
        int num = keyboard.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int x = 1; x <= i; x++) {
                sum = sum + x;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
