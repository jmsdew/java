package main.java.com.ogiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args){

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashcode : " + names.hashCode());

        print(names);
        
        String[] animals = getAnimals();
        System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());

        print(animals);


    }

    public static void print(String[] args){  //args는 변수 명
        System.out.println("args의 hashcode : " +args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " " + "1");
        }
        System.out.println();

    }
    public static String[] getAnimals(){
        String[] animals ={"낙타", "호랑이", "나무늘보"};  // 데이터를 반환하는게 아니라 주소 자체를 반환 - 얕은 복사

        return animals; //주소로 반환
    }


}
