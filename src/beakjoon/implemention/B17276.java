package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B17276 {
    static void plus45(int[][] arr){
        int[] arrX = new int[arr.length];
        int[] arrY = new int[arr.length];
        int[] XY = new int[arr.length];
        int[] YX = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrX[i] = arr[(int) arr.length / 2][i];
            arrY[i] = arr[i][(int) arr.length / 2];
            XY[i] = arr[i][i];
            YX[i] = arr[arr.length-i][i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-i][i]=arrY[i];
            arr[(int) arr.length / 2][i]=YX[i];
            arr[i][i]=arrX[i];
            arr[i][(int) arr.length / 2]=XY[i];
        }
    }
    static void minus45(int[][] arr){
        int[] arrX = new int[arr.length];
        int[] arrY = new int[arr.length];
        int[] XY = new int[arr.length];
        int[] YX = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrX[i] = arr[(int) arr.length / 2][i];
            arrY[i] = arr[i][(int) arr.length / 2];
            XY[i] = arr[i][i];
            YX[i] = arr[arr.length-i][i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-i][i]=arrX[i];
            arr[(int) arr.length / 2][i]=YX[i];
            arr[i][i]=arrY[i];
            arr[i][(int) arr.length / 2]=XY[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());


        for (int z = 0; z < t; z++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                st=new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

        }



    }
}
