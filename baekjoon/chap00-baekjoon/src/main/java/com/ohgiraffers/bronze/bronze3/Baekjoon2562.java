package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon2562 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int count = 0;
        int a = 0;

        for (int i = 1; i <= 9; i++) {
            int e = scr.nextInt();
            if(e > a){
                a = e;
                count = i;
            }

        }
        System.out.println(a);
        System.out.println(count);
    }
}
