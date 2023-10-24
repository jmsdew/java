package main.java.com.ohgiraffers.question;

public class Question5 {
    public static void main(String[] args){

      /*  피보나치 수열(An = An-1 + An-2)을 화면에 출력해라.
        1. 결과값: {1 1 2 3 5 8 13 21 34}
        2. for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
        3. 9개 까지 출력한다.*/

        // 9칸 길이를 가진 배열을 만든다.

        int[] fibo = new int[9];
        // 앞자리 두 수 의 합을 다음 수에 출력한다.
        // 수의 합을 받을 함수를 만든다. - 그 함수를 계속 더해주는 식
        // 앞의 두 수를 1로 정의
        fibo[0] = 1;
        fibo[1] = 1;
        System.out.println(fibo[0]);
        System.out.println(fibo[1]);
        for(int i =2; i < fibo.length; i++){
            fibo[i] = fibo[i-2] + fibo[i-1];
            System.out.println(fibo[i]);
        }





    }
}
