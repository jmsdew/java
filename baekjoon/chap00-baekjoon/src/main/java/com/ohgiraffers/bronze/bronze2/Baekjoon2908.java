package com.ohgiraffers.bronze.bronze2;

import java.util.Scanner;

public class Baekjoon2908 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String[] b = a.split(" ");

        String c ="";
        String d ="";
        for (int i = b[0].length()-1; i >=0 ; i--) {
            c = c+b[0].charAt(i);
        }
        for (int i = b[1].length()-1; i >= 0; i--) {
            d = d+b[1].charAt(i);
        }
        if(Integer.parseInt(c) > Integer.parseInt(d)){
            System.out.println(c);
        }else {
            System.out.println(d);
        }

    }
}
