package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon2010 {
    public static void main(String[] args){



        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++) {
            int c = scr.nextInt();

            if(i==a){
                b += c;
            }else {
            b += c-1;}

        }

        System.out.println(b);




    }
}
