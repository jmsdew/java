package com.ohgiraffers.silver.silver3;

import java.util.Scanner;

public class Beakjoon2559 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt(); // 입력 받을 수열의 길이
        int k = scr.nextInt(); // 연속된 구간의 길이

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scr.nextInt();
        }

        // 초기 구간의 합 계산
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += c[i];
        }

        // 초기 구간의 합을 최댓값으로 설정
        int currentSum = maxSum;

        // 연속된 구간의 합을 계산하여 최댓값 갱신
        for (int i = k; i < n; i++) {
            // 새로운 구간의 합 계산
            currentSum = currentSum - c[i - k] + c[i];
            // 최댓값 갱신
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        // 최댓값 출력
        System.out.println(maxSum);
    }
}
