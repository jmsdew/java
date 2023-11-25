package main.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class Baekjoon25314 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        String b = "long";
        while(a-4 != 0){
            b += " long";
            a -= 4;
        }
        System.out.println(b+" int");
    }
}
