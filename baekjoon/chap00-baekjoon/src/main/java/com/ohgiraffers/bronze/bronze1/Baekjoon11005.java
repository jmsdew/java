package com.ohgiraffers.bronze.bronze1;

import java.util.Scanner;

public class Baekjoon11005 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String[] b = a.split(" ");

        String c = Integer.toString(Integer.parseInt(b[0]), Integer.parseInt(b[1]));
        String e = c.toUpperCase();
        System.out.println(e);
    }
}
