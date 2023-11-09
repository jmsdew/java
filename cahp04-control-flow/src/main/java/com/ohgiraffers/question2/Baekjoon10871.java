package main.java.com.ohgiraffers.question2;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10871 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String[] b = a.split(" ");

        String c = scr.nextLine();
        String[] d = c.split(" ");

        String[] e = new String[Integer.parseInt(b[0])];
        for (int i = 0; i < Integer.parseInt(b[0]); i++) {
            if(Integer.parseInt(d[i]) < Integer.parseInt(b[1])){
                e[i] = d[i];
            }
        }




    }
}
