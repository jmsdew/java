package com.ohgiraffers.silver.silver2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon1874 {
    public static void main(String[] args){



        /*
        *스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
        * 스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.

        1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.

        * 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.

        입력
        첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.

        출력
        입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.
        *
        *
        *
        *  첫줄 - 수열의 길이
        *  첫줄의 수 만큼 정수가 주어짐 - 중복  X
        *  43687521 -> 12345678
        *
        *
        *
        * */

        Stack<Integer> integerStack = new Stack<>();
        Scanner scr = new Scanner(System.in);
        ArrayList arl = new ArrayList();

        int a = scr.nextInt();         /// a 개의 줄에 수열을 이루는 정수가 주어짐

        int[] b = new int[a+1];  // 정수를 받아서 배열을 생성 비교를 위해서
        int m = 1;  // 배열의 m번째 값을 불러오기 위해 설정

        for (int i = 1; i <= a; i++) {
            b[i] = scr.nextInt();  // 배열 값 담음

        }

        for (int i = 1; i <= a; i++) {
            integerStack.push(i);    // 스택영역에 숫자 생성  + 
            arl.add("+");
            while(!integerStack.empty() && integerStack.peek() == b[m]){   //  스택영역의 마지막 숫자와 배열의 m번째 숫자가 일치하고 비어있지 않을 시에 동작
                integerStack.pop();
                arl.add("-");
                m++;
            }
        }

        if(integerStack.empty()){   // 동작이 끝난 후 스택영역이 비어있으면 출력
            for( Object s : arl){
                System.out.println(s);
            }
        }else {
            System.out.println("NO");
        }










    }
}
