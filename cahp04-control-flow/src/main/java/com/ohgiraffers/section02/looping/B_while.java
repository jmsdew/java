package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement(){

        /*
        * [while문 표현식]
        * while(조건식){
        *
        * }
        * */

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int i = 0;

        while(i <= value.length()){  //length는 길이를 재는 것
            i++;

            if(i%2==0){
                continue;
            }else if( i == 11){
                break;
            }
            System.out.println(i);
        }

        boolean isTrue = false;

        /*
        * do while[표현식]
        * do{
        *  먼저 내용을 실행하고 조건식에 들어갑니다.
        * }while(조건식);
        * */
        do {
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요");
            isTrue = scanner.nextBoolean();
        }while (isTrue);


    }

    public void gugudan2(){

        /*
        *  1~n 까지의 값을 입력받으면 실행하고 아니면 다시 입력받는다.
        *  1~n 중에 한 수를 입력받으면 해당 1부터 해당 수 까지의 구구단을 출력한다.
        *
        * */
/*        do while을 이용하여 사용자에게  1단 부터 N단 까지 출력하는 구구단 프로그램을 보여줍니다.

        프로그램은 다음과 같습니다.

                EX) 사용자 입력 값이 6이라면 1~6단 까지의 단을 출력해주세요

        ! 중첩 반복문을 사용해야 합니다.
        2의 배수의 단은 출력하지 않으며
        사용자가 10의 이상의 값을 입력하는 경우 9단까지만 출력을 하고 프로그램을 종료해주세요*/

        Scanner scanner = new Scanner(System.in);
        int want = 0;
        do{
            System.out.print("수 입력 : ");  // do 안에서 입력받기
            want = scanner.nextInt();
            for(int i = 1; i <= want; i++){
                for(int o = 1; o < 10; o++){
                    if(i%2 == 0){
                        continue;
                    }
                    if(i >= 10){
 //                   break;  // 작동은 되지만 여기서 작동 중단
                    }
                    System.out.println(i + " x " + o + " = " + (i*o));
                }
            }
        }while(false); //while 이 false 가 되어야 작동이 중단됨


    }

}
