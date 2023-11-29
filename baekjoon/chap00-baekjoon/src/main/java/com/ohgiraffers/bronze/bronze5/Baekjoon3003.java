package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon3003 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();

        String[] b = a.split(" ");
        String[] c = new String[6];
        c[0] = "1";
        c[1] = "1";
        c[2] = "2";
        c[3] = "2";
        c[4] = "2";
        c[5] = "8";

        int[] a1 = new int[6];


        for (int i = 0; i < 6; i++) {
            if (Integer.parseInt(b[i]) == Integer.parseInt(c[i])) {
                a1[i] = 0;
            } else if (Integer.parseInt(b[i]) > Integer.parseInt(c[i])) {
                a1[i] = (Integer.parseInt(c[i]) - Integer.parseInt(b[i]));
            } else if (Integer.parseInt(b[i]) < Integer.parseInt(c[i])) {
                a1[i] = (Integer.parseInt(c[i]) - Integer.parseInt(b[i]));
            }else {
                a1[i] = 0;
            }

        }
        System.out.println(a1[0] + " "+ a1[1] + " "+ a1[2] + " "+ a1[3] + " "+ a1[4]+ " "+ a1[5]);
    }
}