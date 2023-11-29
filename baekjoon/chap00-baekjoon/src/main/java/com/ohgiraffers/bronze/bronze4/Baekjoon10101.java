package com.ohgiraffers.bronze.bronze4;

import java.util.Scanner;

public class Baekjoon10101 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        if(a==b && c==a && a==60){
            System.out.println("Equilateral");
        }else if((a+b+c)==180 && (a==b) || (a==c) || (b==c)){
            System.out.println("Isosceles");
        }else if((a+b+c)==180){
            System.out.println("Scalene");
        }else {
            System.out.println("Error"); }

    }
}
