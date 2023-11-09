package main.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class Baekjoon11382 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        String a = scr.nextLine();

        String[] b = a.split(" ");

        Long c = 0L;

        for (int i = 0; i < 3; i++) {
            c += Long.parseLong(b[i]);
        }
        System.out.println(c);


    }


}
