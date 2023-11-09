package main.java.com.ohgiraffers.question2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Baekjoon2851 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int b = 0;
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = scr.nextInt();
            }
        for (int i = 0; i < 10; i++) {
            b += a[i];
            if (b>=100){
               if(100-(b-a[i]) >= b - 100){
                   System.out.println(b);
                   break;
               }else if(100-(b-a[i]) < b - 100) {
                   System.out.println(b-a[i]);
                   break;
               }




            }

        }
        if(b<100){
            System.out.println(b);
        }




    }
}
