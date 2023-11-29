package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int quarter = b / 25;
            b %= 25;
            int dime = b / 10;
            b %= 10;
            int nickel = b / 5;
            b %= 5;
            int penny = b;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
