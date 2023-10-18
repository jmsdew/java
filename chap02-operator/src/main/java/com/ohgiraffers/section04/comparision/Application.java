package com.ohgiraffers.section04.comparision;

public class Application {

    public static void main(String[] args){

        /*
        * 비교연산자
        * 비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용한다.
        * */

        /*
        * 비교연산자의 사용
        *
        *  == : 왼쪽의 피연산자와 오른쪽의 피연산자가 같다면 true 다르면 false 를 반환한다.
        *  != : 왼쪽의 피연산자와 오른쪽의 피연산자가 같다면 false 다르면 true 를 반환한다.
        *  > : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 작으면 false 를 반환한다.
        *  >= : 왼쪽의 피연산자가 오른쪽의 피연산자와 같거나 크면 true 작으면 false 를 반환한다.
        *  < : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 false 작으면 true 를 반환한다.
        *  <= : 왼쪽의 피연산자가 오른쪽의 피연산자와  크면 false 같거나 작으면 ture 를 반환한다.
        * 
        * 참고 '!'는 자주 사용하게될 친구로 부정문을 의미
        * */

        System.out.println(!true);
        System.out.println(!false);
        
        int inum1 = 10;
        int inum2 = 20;
        System.out.println("---------------정수 값 비교----------");
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1 <= inum2));


        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("============== 실수값 비교 ===============");
        System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
        System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2));
        System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
        System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
        System.out.println("dnum1이 dnum2보다 작은거나 같은지 비교 : " + (dnum1 <= dnum2));


        /* 목차. 2. 문자값 비교 */
        char ch1 = 'a';
        char ch2 = 'A'; ///아스키코드

        System.out.println("============== 문자값 비교 ===============");
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
        System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + (ch1 <= ch2));

        /* 목차. 3. 논리값 비교 */
        /* 필기. ==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("============== 논리값 비교 ===============");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
        //System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2));
        //System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
        //System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2));
        //System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2));


        /* 목차. 4. 문자열값 비교 */
        /* 필기. 문자열도 ==과 !=은 비교 가능하지만 대소 비교는 불가능하다. */
        // 참조 자료형은 주소값을 비교한다. 주소값이 달라지면 내용이 같아도 false가 출력된다.
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");  // 위에와 다르다

        System.out.println("============== 문자값 비교 ===============");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
        //System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
        //System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2));
        //System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2));
        //System.out.println("str1이 str2보다 작은거나 같은지 비교 : " + (str1 <= str2));
        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println("result의 값은 : " + result);
    }
}
