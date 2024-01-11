package com.ohgiraffers.bronze.bronze2;

import java.util.Scanner;

public class Baekjoon2745 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String[] b = a.split(" ");

        int e = Integer.parseInt(b[0],Integer.parseInt(b[1]));
        System.out.println(e);
    }
}
