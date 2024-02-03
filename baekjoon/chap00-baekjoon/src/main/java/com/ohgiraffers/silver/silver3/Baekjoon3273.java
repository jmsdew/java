package com.ohgiraffers.silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon3273 {
    public static void main(String[] args) throws IOException {


        /*
        *   투포인터 (Two Pointers)
            리스트에 순차적으로 접근해야 할 때 두 개의 점의 위치를 기록하면서 처리하는 알고리즘
            정렬되어있는 두 리스트의 합집합에도 사용됨. 병합정렬(merge sort)의 counquer 영역의 기초가 되기도 합니다.
        *
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int q = Integer.parseInt(br.readLine());

        Arrays.sort(a);
        int count = 0;
        int left = 0;
        int right = n-1;  // 인덱스 끝에 접근하기 위해서 길이 -1

        while(left<right){
            if(a[left] + a[right] == q){
                count++;
                left++;
                right--;
            } else if (a[left] + a[right] < q) {
                left++;
            } else if (a[left] + a[right] > q) {
                right--;
            }
        }



        System.out.println(count);

    }
}
