package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon9086 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

       int a = scr.nextInt();

        for(int i=0; i<a; i++){
            String b = scr.next();
            System.out.print(b.charAt(0));
            System.out.println(b.charAt(b.length()-1));
        }
    }
//    (A+B)×(A-B)
    }

