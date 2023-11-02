package main.java.com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args){

        /*
        * 컬렉션 프레임워크(collection framework)
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터 들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
        * 즉, 데이터를 효율적으로 저장하는 자료구조의 데이터를 처리하는 알고리즘을 미리 구현해 놓은 클래스를 말한다.
        *
        * 컬렉션 프레임워크는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해 놓았다.
        * 1. list 인터페이스
        * 2. set 인터페이스
        * 3. Map 인터페이스
        *
        * list 인터페이스와 set 인터페이스의 공통 부분을 collection 인터페이스에서 정의하고 있다.
        * 하지만 map은 구조 상 차이로 collection 인터페이스에서 정의하고 있지 않다.
        *
        * 각 인터페이스별 특징
        * 1. list 인터페이스
        *  - 순서 있는 데이터의 집합으로 데이터의 중복 저장을 허용한다.
        *  - Vector, ArrayList, LinkedList, Stack(first in last out), Queue(first in first out) 등이 있다.
        *
        * 2. set 인터페이스
        *  - 순서가 없는 데이터의 집합 으로 데이터의 중복을 허용하지 않는다.
        *  - hashMap, TreeSet 등이 있다.
        *
        * 3. Map 인터페이스
        *  - 키와 값 한 쌍으로 이뤄지는 데이터의 집합이다.
        *  - key를 set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
        *  - value 는 중복된 값을 저장할 수 있다.
        *  - hashMap, TreeMap, Hashtable, Properties 등이 있다.
        *
        * */


        /*
        * list 인터페이스를 구현한 모든 클래스는 요소의 저장 순서가 유지되며, 중복 저장을 허용한다.
        * Arraylist, Linkedlist, Vector, Stack 이 있다.
        *
        * ArraList
        *  - 가장 많이 사용되는 클래스이다.
        *  - jdk 1.2 부터 제공되고 있다.
        *  - 내부적으로 배열을 이용하여 요소를 관리하며 인덱스를 이용해 배열 요소에 빠르게 접근 할 수 있다.
        *
        * ArrayList 는 배열의 단점을 보완하기 위해 만들어졌다.
        * 배열은 크기를 변경할 수 없고, 요소 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
        * ArrayList 는 저러한 배열의 단점을 보완하고자
        * 크기 변경(새로운 더 큰 배열을 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현하여 제공한다.
        * 자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
        *
        * */

        ArrayList arrayList = new ArrayList();
        Collection clist = new ArrayList();
        arrayList.add("apple");
        arrayList.add(1);
        arrayList.add(1.2);
        arrayList.add(new Date());

        System.out.println("arrayList : " + arrayList);
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.add(1, "banana");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(2);
        System.out.println("--------------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.set(1, "mamgo");
        System.out.println(arrayList);

        List<String> stringlist = new ArrayList<>();
        stringlist.add("apple");
        stringlist.add("banana");
        stringlist.add("mamgo");
        stringlist.add("orange");
        stringlist.add("grapes");
        stringlist.add(String.valueOf(123));

        System.out.println();
        System.out.println(stringlist);
        Collections.sort(stringlist);
        System.out.println(stringlist);

        stringlist = new LinkedList<>(stringlist);
        Collections.sort(stringlist, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(0)<o2.charAt(0)){
                    return +1;
                }else {return -1; }
            }
        });

        System.out.println(stringlist);

        System.out.println("---------------");
        
        
        /*
        * Iterator\
        * Collection 인터페이스 iiterator() 메소드를 이용하여 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
        * 반복자라고 불리우며, 반복문을 이용하여 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용하여 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false
        * next () : 다음 요소를 반환
        * 
        * */
        Iterator<String> dIter = ((LinkedList<String>) stringlist).descendingIterator();

/*        while((dIter.hasNext())){
            System.out.println(dIter.next());
        }
        while((dIter.hasNext())){
            System.out.println(dIter.next());
        }     */                                      //// next방식으로 접근하는 1회성 - 다 호출 후 소멸함

        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()){
            descList.add(dIter.next());
        }
        System.out.println(dIter.hashCode());
        System.out.println(descList);




    }
}
