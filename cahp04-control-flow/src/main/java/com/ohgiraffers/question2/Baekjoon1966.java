package main.java.com.ohgiraffers.question2;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1966 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        String a = scr.nextLine();

        BigInteger bigInteger = new BigInteger(a, 2);

        long b = bigInteger.longValue();

        String c= Long.toOctalString(b);

        System.out.println(c);










    }
}
