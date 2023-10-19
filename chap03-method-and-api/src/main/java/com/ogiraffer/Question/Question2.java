package main.java.com.ogiraffer.Question;

import java.util.Objects;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args){

        //        계산기 만들기
//        계산기에 필요한 기능은 + , - , * , / , %  총 5가지 연산자다.
//        ((예시))
//        첫 번 째 숫자를 입력하세요 :
//        2
//        연산할 기호를 쓰세요 :
//        +
//        두 번 째 숫자를 입력하세요 :
//        2
//        결과는 4입니다

        Scanner scr = new Scanner(System.in);

        Question2 app1 = new Question2();

        System.out.println("첫 번 째 숫자를 입력하세요 :");
        int one = scr.nextInt();


        System.out.println("연산할 기호를 쓰세요 :");
        String two = scr.next();

        System.out.println("두 번 째 숫자를 입력하세요 :");
        int three = scr.nextInt();

        int total1 = app1.total(one,two,three);
        System.out.println("결과는 " +app1.total(one,two,three) + "입니다.");


    }

    public int total(int a,String b,int c){
        if(Objects.equals(b, "+")){
            return (a+c);
        }else if(Objects.equals(b, "-")){
            return (a-c);
        }else if(Objects.equals(b, "*")){
            return (a*c);
        }else if(Objects.equals(b, "/")){
            return (a/c);
        }else{
            return (a%c);
        }
    }
}
