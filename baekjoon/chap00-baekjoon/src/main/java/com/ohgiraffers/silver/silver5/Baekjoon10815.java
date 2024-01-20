package com.ohgiraffers.silver.silver5;

import java.util.Scanner;

public class Baekjoon10815 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.nextLine();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scr.nextInt();
        }
        scr.nextLine();
        int c = scr.nextInt();
        scr.nextLine();
        int[] d = new int[c];
        for (int i = 0; i < c; i++) {
            d[i] = scr.nextInt();
        }

    }
}
