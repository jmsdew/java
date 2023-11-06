package main.java.com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();



        try{
            et.checkEnoghMoney(10000,1000000);
            et.checkEnoghMoney(100000,100);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
