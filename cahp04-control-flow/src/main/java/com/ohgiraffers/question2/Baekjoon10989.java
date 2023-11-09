package main.java.com.ohgiraffers.question2;

import java.io.*;
import java.util.*;

public class Baekjoon10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int[] c = new int[a];

        for (int i = 0; i < a; i++) {
            c[i] = Integer.parseInt(br.readLine());

        }
        Arrays.sort(c);
        for (int te : c) {
            bw.write(Integer.toString(te));
            bw.newLine();


        }
        bw.flush();
    }
}
