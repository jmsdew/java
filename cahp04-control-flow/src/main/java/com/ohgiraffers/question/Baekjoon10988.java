package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Baekjoon10988 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        String a = scr.nextLine();

        String b = "";
        for (int i = a.length()-1;i>=0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equals(b)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
