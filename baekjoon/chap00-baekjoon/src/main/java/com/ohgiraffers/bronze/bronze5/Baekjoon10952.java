package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon10952 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);


        while(true){
            String a =scr.nextLine();
            String[] b = a.split(" ");
            int[] c = new int[2];
            for (int i = 0; i < 2; i++) {
                c[i] = Integer.parseInt(b[i]);
            }
            if(c[0] == c[1] && c[0] == 0){
                return;
            }else {
                System.out.println(c[0] + c[1]);
            }

        }





    }
}
