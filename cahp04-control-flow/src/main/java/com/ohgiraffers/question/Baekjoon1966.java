package main.java.com.ohgiraffers.question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon1966 {
    public static void main(String[] args){

        /*
        * 첫 줄에 테스트케이스의 수가 주어진다. 각 테스트케이스는 두 줄로 이루어져 있다.

    테스트케이스의 첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)과, 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여
    * 있는지를 나타내는 정수 M(0 ≤ M < N)이 주어진다. 이때 맨 왼쪽은 0번째라고 하자.
    * 두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다. 중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.
        * */

        Scanner scr = new Scanner(System.in);

        // a 개의 테스트케이스가 주어짐 - for문으로 반복문 생성
        // 몇 개의 숫자가 나오는지 m이 주어짐
        // 반복문으로 array에 값 입력
        // 몇번 째 문서가 궁금한지 n 이 주어짐
        // 1~9까지 랜덤하게 숫자가 주어지면 높은 숫자가 우선적으로 출력됨 - 동일할 수 있음




        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = in.nextInt();	// 테스트 케이스

        while (T-- > 0) {

            int N = in.nextInt();
            int M = in.nextInt();

            LinkedList<int[]> q = new LinkedList<>();	// Queue로 활용 할 연결리스트

            for (int i = 0; i < N; i++) {
                // {초기 위치, 중요도}
                q.offer(new int[] { i, in.nextInt() });
            }

            int count = 0;

            while (!q.isEmpty()) {	// 한 케이스에 대한 반복문

                int[] front = q.poll();	// 가장 첫 원소
                boolean isMax = true;	// front 원소가 가장 큰 원소인지를 판단하는 변수

                // 큐에 남아있는 원소들과 중요도를 비교
                for(int i = 0; i < q.size(); i++) {

                    // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                    if(front[1] < q.get(i)[1]) {

                        // 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        // front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
                        isMax = false;
                        break;
                    }
                }

                // front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
                if(isMax == false) {
                    continue;
                }

                // front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서다.
                count++;
                if(front[0] == M) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
                    break;
                }

            }

            sb.append(count).append('\n');

        }
        System.out.println(sb);



    }
}
