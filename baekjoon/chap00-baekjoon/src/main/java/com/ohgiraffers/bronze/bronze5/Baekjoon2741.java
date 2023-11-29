package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon2741 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = 0;
        for(int i=0; i < a; i++){
            b += 1;
            System.out.println(b);
        }
    }
}
