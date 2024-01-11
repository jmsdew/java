package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon27433 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        long a = scr.nextLong();
        System.out.println(fac(a));


    }
    public static long fac(long a){
        if(a==0){
            return 1;
        }else {
            return a * fac(a-1);
        }
    }
}
