package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Questtion4 {
    public static void main(String[] args){

        ///  문제 1 번

        //    염라대왕이 화나셨다! 명부 리스트에서 몇 명을 추출하여
        //    그 중에 한 명을 지옥에 보낼려고 한다.


        // 배열과 for문을 한 번씩 써야한다.
        //    보이는 출력은 아래와 같다.
    /* EX)
    *  사람들을 몇 명 뽑을까요?
    *      3
    * 1번째 운 없는 자의 이름을 입력하세요 :
      홍길동
      2번째 운 없는 자의 이름을 입력하세요 :
      고길동
      3번째 운 없는 자의 이름을 입력하세요 :
      강수진
      *
      * 지옥에 갈 사람은 누구입니다!
    *
    * */
        Scanner scr = new Scanner(System.in);
        System.out.println("사람들을 몇 명 뽑을까요?");
        int people = scr.nextInt();
        // 사람들을 몇 명 뽑을까요?

        scr.nextLine(); // 개행 문자 처리

        String[] full = new String[people];

        // 사람 수에 맞는 이름을 입력받는 반복문
        for (int i = 0; i < people; i++) {
            System.out.print((i + 1) + "번째 운 없는 자의 이름을 입력하세요: ");
            full[i] = scr.nextLine();
        }

        int hellIndex = (int) (Math.random() * people);
        System.out.println("지옥에 갈 사람은 " + full[hellIndex] + "입니다.");
    }
}
