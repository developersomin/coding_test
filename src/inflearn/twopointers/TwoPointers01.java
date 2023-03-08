package inflearn.twopointers;

import beakjoon.bruteforce.B1012;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
        두 배열 합치기
        오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
        을 작성하세요.
        ▣ 입력설명
        첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
        두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
        세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
        네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
        각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
        ▣ 출력설명
        오름차순으로 정렬된 배열을 출력합니다.
        ▣ 입력예제 1
        3
        1 3 5
        5
        2 3 6 7 9
        ▣ 출력예제 1
        1 2 3 3 5 6 7 9
*/

public class TwoPointers01 {

    public List<Integer> solution(int[] arrA, int[] arrB,int a, int b) {
        List<Integer> array = new ArrayList<>();
        int pointA=0;
        int pointB=0;
        while (pointA < a && pointB < b) {
            if (arrA[pointA] < arrB[pointB]) {
                array.add(arrA[pointA++]);
            } else {
                array.add(arrB[pointB++]);
            }
        }
        while (pointA < a)  array.add(arrA[pointA++]);
        while (pointB < b)  array.add(arrB[pointB++]);

        return array;

    }

    public static void main(String[] args) {
        TwoPointers01 twoPointers01 = new TwoPointers01();
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

        for (int x : twoPointers01.solution(arrA, arrB, a, b)) {
            System.out.print(x+" ");
        }

    }
}
