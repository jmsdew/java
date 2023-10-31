package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Baekjoon5532 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        int d = scr.nextInt();
        int e = scr.nextInt();

        if (b % d == 0) {
            if (c % e == 0) {
                if ((b / d) >= (c / e)) {
                    System.out.println(a - (b / d));
                } else {
                    System.out.println(a - (c / e));
                }
            }else if ((c % e) != 0) {
                int g = (c / e + 1);
                if ((b / d) >= g) {
                    System.out.println(a - (b / d));
                } else {
                    System.out.println(a - g);
                }
            }

        }
        if(b%d !=0) {
            if (c % e == 0) {
                if ((b / d) >= (c / e)) {
                    System.out.println(a - (b / d));
                } else {
                    System.out.println(a - (c / e));
                }
            }
            if ((c % e) != 0) {
                int g = (c / e + 1);
                if ((b / d) >= g) {
                    System.out.println(a - (b / d));
                } else {
                    System.out.println(a - g);
                }
            }
        }
    }
}
