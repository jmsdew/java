package section01.literal;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("Hello world!"); /*println 은 줄바꿈 출력*/

      /*여러 가지 값의 형태를 출력할 수 있다. */
        /*목차 1. 숫자 형태의 값*/
        System.out.println(123);   //정수형 리터럴(값 그 자체)
        System.out.println(1.23);  //실수형 리터럴

        /*목차2. 문자 형태의 값 출력*/
        System.out.println('a');  //문자형 리터럴
        // System.out.println('ab'); // ''두 개 이상은 문자로 취급 하지 않기 때문에 에러가 발생됨
        System.out.println('1');  // 문자형

        /*목차3. 문자열 형태의 값 출력*/
        System.out.println("안녕하세요"); //문자열(문자 배열) 형 리터럴

        /*목차4. 논리 형태의 값 출력*/
        System.out.println(true);
        System.out.println(false);
    }
}