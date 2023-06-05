package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size=4*(n-1)+1;
        char[][] arr = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j]=' ';
            }
        }
        int index=0;

        for (int a = 0; a < n; a++) {
            for (int j = index-0; j < size-index; j++) {
                arr[index][j] = '*';
                arr[size-1 - index][j] = '*';
                arr[j][index] = '*';
                arr[j][size-1 - index] = '*';
            }
            index+=2;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
