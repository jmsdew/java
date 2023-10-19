package main.java.com.ogiraffer.Question;

import java.util.Random;

public class Question3 {

    public static void main(String[] args){

        // A와 B라는 무작위의 숫자를 출력해 그 합을 반환하는 함수를 만들어 주세요.
        // 답변 양식은  ("A의 값은 () B의 값은 () 이므로 합은 ()입니다.")
        // static 메소드를 활용해주세요

        int A = (int)(Math.random()*10);
        int B = (int)(Math.random()*10);

        int ab = number1(A,B);
        System.out.println("A의 값은 " +A+ " B의 값은 " +B+ "이므로 합은 " +ab+ "입니다.");



    }
    public static int number1(int A, int B){
        int number2 = A + B;
        return number2;
    }
}
