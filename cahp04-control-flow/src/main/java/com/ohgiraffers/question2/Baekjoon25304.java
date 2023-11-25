package main.java.com.ohgiraffers.question2;

import java.util.Scanner;

public class Baekjoon25304 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String b = scr.nextLine();

        long e = 0;
        for (int i = 0; i < Integer.parseInt(b); i++) {
            String c = scr.nextLine();
            String[] d = c.split(" ");
            e += (Long.parseLong(d[0])*(Long.parseLong(d[1])));
        }
        if(a.equals(String.valueOf(e))){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
