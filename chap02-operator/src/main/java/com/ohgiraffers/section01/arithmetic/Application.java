package com.ohgiraffers.section01.arithmetic;

public class Application {
    public static void main(String[] args){
        /*
        * 산술 연산자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용되는 연산자이다.
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
        * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        * */

        /* 산술 연산자의 종류
        *  +
        *  -
        *  *
        *  /
        *  %
        * 
        *  연산자의 우선순위는 우리가 알고 있는 수학과 동일하다
        * */


        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + num1 + num2); //문자열로 인식됨 형변환 형변환
        System.out.println("num1 + num2 = " + (num1 + num2));
       //  System.out.println("num1 - num2 = " + num1 - num2);  // 문자열은 더하기만 가능하다
        System.out.println("num1 * num2 = " + num1 * num2);   // 우선순위 곱하기 숫자열계산 후 문자열과 만나 문자열로 형변환
        System.out.println("num1 / num2 = " + num1 / num2); 
        System.out.println("num1 % num2 = " + num1 % num2);
    }
}
