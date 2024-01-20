package com.ohgiraffers.silver.silver4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);


        String[] c = new String[a + b];

        for (int i = 0; i < a + b; i++) {
            c[i] = br.readLine();
        }

        int count = 0;

        for (int i = 0; i < a; i++) {
            for (int j = a; j < a + b; j++) {
                if (c[i].equals(c[j])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}