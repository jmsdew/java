package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Baekjoon2839 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();

        int count = 0;

        while (a > 0) {
            if (a % 5 == 0) {
                count += a / 5;
                a = 0;
            } else {
                a -= 3;
                count++;
            }

            if (a < 0) {
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}