package codeup;

import java.util.Scanner;

public class C4596 {
    public void solution(int[][] a){

        int max = a[0][0];
        int x = 1;
        int y = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        C4596 main = new C4596();
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[9][9];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        main.solution(a);



    }
}

