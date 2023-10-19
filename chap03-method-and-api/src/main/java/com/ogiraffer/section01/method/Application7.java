package main.java.com.ogiraffer.section01.method;

public class Application7 {
    public static void main(String[] args){

        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        *
        * */

        int first = 10;
        int second = 5;

        Application7 app7 = new Application7();

        int result = app7.app1(first,second);

        System.out.println("두 수를 더한 값은 "+ result);

        System.out.println("두 수를 뺀 값은 "+ result);

        System.out.println("두 수를 곱한 값은 "+result);

        System.out.println("두 수를 나눈 값은 " +result);



    }

    public int app1(int a, int b) {
        int a1 = a + b;
        return a1;
    }
    public int app2(int a, int b){
        int a2 = a - b;
        return a2;
    }
    public int app3(int a, int b){
        int a3 = a * b;

        return a3;
    }
    public int app4(int a, int b){
        int a4 = a / b;
        return a4;

    }
}
