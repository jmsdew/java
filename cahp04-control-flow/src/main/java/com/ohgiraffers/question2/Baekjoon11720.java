package main.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class Baekjoon11720 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.nextLine();
        String b = scr.nextLine();
        int e = 0;
        for (int i = 0; i < a; i++) {
            String[]c = b.split("");
            e += Integer.parseInt(c[i]);
        }

        System.out.println(e);
    }
}
