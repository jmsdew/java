package main.java.com.ohgiraffers.section06.singleton;

public class LazySingleton {
    private static LazySingleton lazy;

   private LazySingleton(){
       System.out.println("lazy 생성됨");
   }

   public static LazySingleton getInstance(){
       if(lazy == null){
           System.out.println("lazy가 null인 상태");
           lazy = new LazySingleton();
           System.out.println(" 생성 되었습니다. ");
       }
       System.out.println("lazy가 널이 아닌 상태");
       return lazy;
   }
}
