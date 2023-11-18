package main.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class Baekjoon25206 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        double a = 0;
        for (int i = 0; i < 20; i++) {
            String b = scr.nextLine();
            String[] c = b.split(" ");
            if(c[2].equals("P")){
                a+= 0;
            }else if(c[2].equals("F")){
                a += 0;
            }else{
            a += Double.parseDouble(c[1]);}
        }
        double b = a/20;
        System.out.println(b);


    }
}
