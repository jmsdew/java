package com.ohgiraffers.bronze.bronze2;

import java.util.Scanner;

public class Baekjoon10870 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        System.out.println(fib(a));
    }
    public static int fib(int a){
        if(a == 0){
            return 0;
        } else if(a == 1){
            return 1;
        }else {
            return fib(a-1)+fib(a-2);
        }

    }
}
