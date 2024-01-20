package com.ohgiraffers.silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Baekjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        Set<String> setA = new TreeSet<>();
        Set<String> result = new TreeSet<>();

        for (int i = 0; i < a; i++) {
            setA.add(br.readLine());
        }

        for (int i = 0; i < b; i++) {
            String input = br.readLine();
            if (setA.contains(input)) {
                result.add(input);
            }
        }

        System.out.println(result.size());
        for (String aa : result) {
            System.out.println(aa);
        }
    }
}

