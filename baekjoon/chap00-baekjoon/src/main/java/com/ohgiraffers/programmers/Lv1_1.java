package com.ohgiraffers.programmers;


import java.util.HashSet;
import java.util.Scanner;

public class Lv1_1 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        String e = String.valueOf(a);
        String[] b = e.split("");
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = Integer.parseInt(b[i]);
        }
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            k += c[i];
        }
        System.out.println(k);


    }

}
