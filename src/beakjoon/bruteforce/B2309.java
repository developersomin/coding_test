package beakjoon.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B2309 {
    public List<Integer> solution(int[] arr){
        Arrays.sort(arr);
        List<Integer> array = new ArrayList<>();
        for (int x : arr) {
            array.add(x);
        }

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    array.remove(j);
                    array.remove(i);
                    break;
                }
            }
            if(array.size() == 7)
                break;
        }
        return array;
    }


    public static void main(String[] args) {
        B2309 b2309 = new B2309();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : b2309.solution(arr)) {
            System.out.println(x);
        }

    }
}
