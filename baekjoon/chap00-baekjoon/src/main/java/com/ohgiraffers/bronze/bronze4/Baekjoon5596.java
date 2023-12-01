package com.ohgiraffers.bronze.bronze4;

import java.util.Scanner;

public class Baekjoon5596 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        String a = scr.nextLine();
        String b = scr.nextLine();

        String[] c = a.split(" ");
        String[] d = b.split(" ");

        int e = 0;
        int f = 0;

        for (int i = 0; i < c.length; i++) {
            e += Integer.parseInt(c[i]);
        }
        for (int i = 0; i < d.length; i++) {
            f += Integer.parseInt(d[i]);
        }

        if(e>=f){
            System.out.println(e);
        }else {
            System.out.println(f);
        }
    }
}
