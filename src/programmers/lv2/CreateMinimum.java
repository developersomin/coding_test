package programmers.lv2;

import java.util.*;

public class CreateMinimum {
    public int solution(int[] arr, int[] arr1) {
        int answer =0;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] * arr1[arr.length - 1 - i];
        }
        return answer;
    }

    public static void main(String[] args) {
        CreateMinimum T = new CreateMinimum();
        int[] arr = {1, 4, 2};
        int[] arr1 = {5, 4, 4};
        System.out.println(T.solution(arr,arr1));

    }
}
