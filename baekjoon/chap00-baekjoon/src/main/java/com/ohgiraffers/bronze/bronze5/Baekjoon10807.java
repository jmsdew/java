package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon10807 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.nextLine();

        String b = scr.nextLine();

        String e = scr.nextLine();


        String[] c = b.split(" ");


        int d = 0;
        for (int i = 0; i < a; i++) {
            if (c[i].equals(e)){
                d += 1;
            }
        }
        System.out.println(d);




    }
}
