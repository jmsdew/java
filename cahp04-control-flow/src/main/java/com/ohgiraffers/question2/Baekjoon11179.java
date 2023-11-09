package main.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class Baekjoon11179 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        Long a = scr.nextLong();

        String b = Long.toBinaryString(a);

        String c = "";

        for (int i = b.length()-1; i >= 0; i--) {
            c = c + b.charAt(i);
        }




        Long d = Long.parseLong(c, 2);




        System.out.println(d);

    }
}
