package section01.literal;

public class Application2 {

    public static void main(String[] args){
        /*수업 목표. 정수 리터럴 연산 형식의 값을 직접 연산 한다.*/

        /*
        * 1. 123 + 456
        * 2. 123 - 456
        * 3. 123 * 456
        * 4. 40 / 10
        * 5. 10 % 2
        * */

        System.out.println(123+456);
        System.out.println(123-456);
        System.out.println(123*456);
        System.out.println(40/10);
        System.out.println(10%2);

        /*실수와 실수 리터럴 연산*/
        /*
        * 1. 1.23 + 1.23
        * 2. 1.23 - 1.23
        * 3. 1.23 * 1.23
        * 4. 1.23 / 1.23
        * 5. 1.23 % 1.23
        * */

        System.out.println("--------------------------");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);

        System.out.println("--------------------------");
        /*
        * 1. 1 + 0.5
        * 2. 1 - 0.5
        * 3. 1 * 0.5
        * 4. 1 / 0.5
        * 5. 1 % 0.5
        * */

        System.out.println(1+0.5);
        System.out.println(1-0.5);
        System.out.println(1*0.5);
        System.out.println(1/0.5);  // 데이터 타입이 달라짐
        System.out.println(1%0.5);

        System.out.println("-------------문자와 문자의 연산-------------");
        
        /*문자와 문자의 연산*/
        /*목차2. 문자의 연산*/
        /*필기. 문자 끼리의 연산도 사칙 연산에 mod 연산 까지 가능 하다.*/
        /*설명. 지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산에 사용 가능 하다는 것에 집중 하자 */
        // ('a' + 'b')
        // ('a' - 'b')
        // ('a' * 'b')
        // ('a' / 'b')
        // ('a' % 'b')
        // 10진법으로 a는 97 b는 98
        // 컴퓨터는 문자를 인식하지 못하기 떄문에 대응되는 숫자들이 매칭되어 있다 (아스키 코드(영어만)와 유니코드(전세계언어))
        System.out.println('ㄱ' + 'ㄷ');
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /*문자와 문자의 연산*/
        /*목차3. 문자열과의은 + 연산만 가능하다 연산*/

        // 데이터 값이 다를 때는 자동 형변환을 통해 최상위 타입을 변경된다. -- 문자열이 최 상위 타입
        System.out.println("------------문자 열과 다른 형태의 값 연산--------------");

        System.out.println("hello" + 1004);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a'); //연산 결과는 다른 형태의 값들도 문자열로 취급 하여 같은 문자열 결과가 출력됨
        System.out.println("hello" + true);


        System.out.println("123" + "456");
       
        // 논리값 연산
        // 4-1 논리값과 논리값 연산
        // System.out.println(true + 1); 불가능
        // System.out.println(true + false); 불가능
        System.out.println(true + "false"); // 문자열 형식과만 연결 가능함
        System.out.println("안녕" +'f' + 'a');

        
    }
}
