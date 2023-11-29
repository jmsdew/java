package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon2441 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();

        for (int i = a; i >= 0; i--) {
            for(int j = 0; j < a-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }




        }

    }

