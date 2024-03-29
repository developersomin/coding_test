package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[][] arr = new int[h][w];
        for (int i = 0; i < h; i++) {

            String s = br.readLine();
            if (s.charAt(0) == '.') {
                arr[i][0] = -1;
            } else {
                arr[i][0]= 0;
            }

            for (int j = 1; j < w; j++) {
                if (s.charAt(j) == '.' && arr[i][j - 1] == -1) {
                    arr[i][j] = -1;
                } else if (s.charAt(j) == 'c') {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = arr[i][j - 1] + 1;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
