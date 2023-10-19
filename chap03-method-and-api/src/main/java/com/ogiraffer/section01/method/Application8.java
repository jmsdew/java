package main.java.com.ogiraffer.section01.method;

public class Application8 {
    public static void main(String[] args){
        /*
        * static 메서드
        *
        * static 메소드를 호출하는 방법
        * 클래스.메소드명()  - 스태틱은 클래스 명으로 구분
        * 스태틱은 실행시 처음부터 다 읽고 메모리에 자리를 만들어 놓음
        * 나머지 메소드는 메모리에 적재되지 않고 따로 호출해야 읽음
        * */

     /* 권장되지않음   Application8 app1 = new Application8();
        
        
        int result = app1.sumToNumber(1,2); 스태틱 필드는 이렇게 접근하는게 권장되지 않음  */

        int result2 = Application8.sumToNumber(1,2);
    }

    public static int sumToNumber(int num1, int num2){
        return  num1 + num2;
    }

    public void test(){
        System.out.println("qfqfqwf");
    }

}
