package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon10872 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();

        int b = 1;
        while(a>0){
            b *= a;
            a--;
        }
        System.out.println(b);
    }
}
