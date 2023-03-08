package inflearn.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*

공통원소 구하기
        A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로
        그램을 작성하세요.
        ▣ 입력설명
        첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
        두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
        세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
        네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
        각 집합의 원소는 1,000,000,000이하의 자연수입니다.
        ▣ 출력설명
        두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
        ▣ 입력예제 1
        5
        1 3 9 5 2
        5
        3 2 5 7 8
        ▣ 출력예제 1
        2 3 5
*/

public class TwoPointers02 {

    public List<Integer> solution(int[] arrA, int[] arrB,int a, int b) {
        List<Integer> array = new ArrayList<>();
        int pointA=0;
        int pointB=0;
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        while (pointA < a && pointB < b) {
            if (arrA[pointA] < arrB[pointB]) {
                pointA++;
            } else if (arrA[pointA] == arrB[pointB]) {
                array.add(arrA[pointA++]);
                pointB++;
            } else {
                pointB++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        TwoPointers02 twoPointers02 = new TwoPointers02();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arrA = new int[a];
        for (int i = 0; i < a; i++) {
            arrA[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int[] arrB = new int[b];
        for (int i = 0; i < b; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int x : twoPointers02.solution(arrA, arrB, a, b)) {
            System.out.print(x+" ");
        }

    }
}
