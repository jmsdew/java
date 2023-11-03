package main.java.com.ohgiraffers.section03.map.run;

import javax.imageio.IIOException;
import java.io.*;
import java.util.EmptyStackException;
import java.util.Properties;
import java.util.Stack;

public class Application02 {
    public static void main(String[] args){

        /*
        * Properties란
        * hashMap 을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * */
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "localHost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");
        System.out.println(prop);
        
      /*  try { // 예외가 발생될 수 있는 코드를 묶는다.
            // 엄마가 고기를 사오라고 했다.
        }catch (*//*엄마 카드에 돈이 없는 경우*//*){  /// 대상 예외에 해당되면 코드 블럭에서 처리한다.
            // 내 카드로 결제
        }catch (*//*편의점을 못 찾는 경우*//*){
            // 인터넷으로 주문
        }catch (*//*엄마 카드와 내 카드 모두 돈이 없는 경우*//*){
            // 계산 취소
        }*/

        try{
            prop.store(new FileOutputStream("driver.dat"), "jdbcDriver");  // 존재하는지 확인하는 명령어 store
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        Stack<Integer> integerStack = new Stack<>();




        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            prop2.list(System.out);
            System.out.println(prop2.getProperty("driver"));
            System.out.println(prop2.getProperty("url"));
            System.out.println(prop2.getProperty("user"));
            System.out.println(prop2.getProperty("password"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {                               // ioexception 이 filenot 의 부모요소 그래서 위에 올 수 없음
            throw new RuntimeException(e);
        }


    }
}
