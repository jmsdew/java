package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

public class Application2 {
    public static void main(String[] args){

        /*
        * 와일드카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때
        * 그 객체의 타입 변수를 제한할 수 있다.
        * <?> : 제한 없음
        * <? extends Type> : 와일드 카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 허용)
        * <? super Type> : 와일드 카드 하한 제한(Type과 Type의 부모를 이용한 생성만 인자로 허용)
        *
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal())); 자식요소가 아님

//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

         wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
         wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
         wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

//         wildCardFarm.extendType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendType(new RabbitFarm<>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));



    /*
      아래의 내용을 테스트 하기 전
      RabbitFarm<T extends Rabbit>  --> RabbitFarm<T extends Object>

      // RabbitFarm<T extends Rabbit> 으로타입이 지정되어 있기 때문에
        // superType(new RabbitFarm<>(new Bunny() 로 정의하면
        // Rabbit ~ Bunny 사이만 범위로 지정된다.

 //       wildCardFarm.superType(new RabbitFarm<Mammal>(new Mammal()));


        // superType(new RabbitFarm<>(new Bunny() 로 정의되어 있기 때문에
        // Bunny와 관련이 없는 Reptile 타입을 지시할 수 없게 된다.
//        RabbitFarm<Reptile> test = new RabbitFarm<>();
//        wildCardFarm.superType(new RabbitFarm<Reptile>(new Snake()));*/

    }



}
