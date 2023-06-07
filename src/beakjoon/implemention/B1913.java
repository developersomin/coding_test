package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr=new int[n][n];
        int size = (int)n/2 +1;
        int start =(int)Math.pow(n,2);
        for (int i = 0; i < size; i++) {
            for (int x = i; x < n-i; x++) {
                arr[x][i]=start;
                start--;
            }
            for(int y=i+1; y<n-i; y++){
                arr[n-1-i][y]=start;
                start--;
            }
            for (int x = n - 2 - i; x >= i; x--) {
                arr[x][n-1-i]=start;
                start--;
            }
            for (int y = n - 2 - i; y >= i + 1; y--) {
                arr[i][y]=start;
                start--;
            }
        }
        int x = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == x) {
                    System.out.println((i+1)+" "+(j+1));
                    break;
                }
            }
        }
        br.close();
    }

}
