package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon10818 {
    public static void main(String[] args){


        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        scr.nextLine();
        String b = scr.nextLine();

        String[] c = b.split(" ");

        int e = Integer.parseInt(c[0]);
        int r = Integer.parseInt(c[0]);

        for (int i = 0; i < a; i++) {
            int q = Integer.parseInt(c[i]);

            if(r > q){
                r = q;
            }

            if(e < q){
                e = q;
            }
        }
        System.out.println(r +" "+ e);

    }
}
