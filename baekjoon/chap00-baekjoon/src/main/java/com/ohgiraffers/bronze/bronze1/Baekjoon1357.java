package com.ohgiraffers.bronze.bronze1;

import java.util.Scanner;

public class Baekjoon1357 {
    public static void main(String[] args){


        Scanner scr = new Scanner(System.in);
        String a = scr.next();
        String b = scr.next();

        String c = "";
        String d = "";

        for (int i = a.length()-1; i >=0; i--) {
            c += a.charAt(i);
        }
        for (int i = b.length()-1; i >=0; i--) {
            d += b.charAt(i);
        }

        int e = Integer.parseInt(c);
        int f = Integer.parseInt(d);

        int g = e+f;

        String h = Integer.toString(g);
        String q = "";

        for (int i = h.length()-1; i >=0; i--) {
            q += h.charAt(i);
        }
        int z = Integer.parseInt(q);
        System.out.print(z);
    }
}
