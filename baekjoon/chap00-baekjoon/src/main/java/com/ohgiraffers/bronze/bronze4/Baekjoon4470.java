package com.ohgiraffers.bronze.bronze4;

import java.util.Scanner;

public class Baekjoon4470 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.nextLine();

        for (int i = 1; i <= a; i++) {
            String b = scr.nextLine();
            System.out.println(i + ". " + b);
        }


    }
}
