package beakjoon.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B1012 {



    public static void main(String[] args) {
        B1012 b1012 = new B1012();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[10][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }


    }
}
