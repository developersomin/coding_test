package inflearn.twopointers;

import java.util.Scanner;
/*
    연속된 자연수의 합
        N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는
        방법의 가짓수를 출력하는 프로그램을 작성하세요.
        만약 N=15이면
        7+8=15
        4+5+6=15
        1+2+3+4+5=15
        와 같이 총 3가지의 경우가 존재한다.
        ▣ 입력설명
        첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
        ▣ 출력설명
        첫 줄에 총 경우수를 출력합니다.
        ▣ 입력예제 1
        15
        ▣ 출력예제 1
        3*/
public class SumConsecutiveNumbers05 {

    public int solution(int n) {
        int[] arr = new int[n / 2 + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        int count = 0;
        int leftPoint = 0;
        int sum = 0;
        for (int rightPoint = 0; rightPoint < n / 2 + 1; rightPoint++) {

            sum += arr[rightPoint];
            if (sum == n) {
                count++;
            }
            while (sum >= n) {
                sum -= arr[leftPoint++];
                if (sum == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SumConsecutiveNumbers05 sumConsecutiveNumbers05 = new SumConsecutiveNumbers05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumConsecutiveNumbers05.solution(n));
    }



}
