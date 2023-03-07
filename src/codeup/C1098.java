
package codeup;


import java.util.Scanner;

public class C1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h][w];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt(); //0가로 1 세로
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (d == 0) {
                for (int j = y; j < y + l; j++) {
                    arr[x][j] = 1;

                }
            } else if (d==1) {
                for (int j = x; j < x + l; j++) {
                    arr[j][y] = 1;

                }
            }

        }
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.printf("\n");
        }
    }
}

