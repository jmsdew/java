package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application02 {
    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoghMoney(1000, -500);
        }catch (NotEnoughMoneyException e){
            e.printStackTrace();
        }catch (PriceNegativeException | MoneyNegativeException e){        // 형제끼리는 같이 쓸 수 있음
            e.printStackTrace();
        }finally {
            System.out.println("무조건 마지막에 동작됨");
        }
    }
}
