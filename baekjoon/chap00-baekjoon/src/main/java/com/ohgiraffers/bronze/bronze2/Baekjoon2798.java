package com.ohgiraffers.bronze.bronze2;


import java.util.Scanner;

public class Baekjoon2798 {
    public static void main(String[] args){

        /*카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다.
        블랙잭은 카지노마다 다양한 규정이 있다. 한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
        김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다.
        그런 후에 딜러는 숫자 M을 크게 외친다.
        이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에,
        플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
        N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.*/


        // n장의 카드를 놓고 숫자 m 을 외침 - 플레이어는 3장을 골라 m에 가장 가까운 수를 만들어야 함
        // 3<= n <= 100 int 형으로 함

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }

        int result = search(arr, a, b);
        System.out.println(result);
    }


    // 탐색
    static int search(int[] arr, int a, int b) {
        int result = 0;

        // 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
        for (int i = 0; i < a - 2; i++) {

            // 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
            for (int j = i + 1; j < a - 1; j++) {

                // 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
                for (int k = j + 1; k < a; k++) {

                    // 3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    // M과 세 카드의 합이 같다면 temp return 및 종료
                    if (b == temp) {
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신
                    if(result < temp && temp < b) {
                        result = temp;
                    }
                }
            }
        }

        // 모든 순회를 마치면 result 리턴
        return result;
    }

}
