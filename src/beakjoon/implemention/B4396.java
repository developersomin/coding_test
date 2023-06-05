package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4396 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        char[][] check = new char[n][n];
        int[] arrX={-1,-1,-1,0,0,1,1,1};
        int[] arrY={-1,0,1,-1,1,-1,0,1};
        int key=0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'x') {
                    if (arr[i][j] == '*')
                        key = 1;
                    else {
                        int count = 0;
                        for (int a = 0; a < arrX.length; a++) {
                            int x = i + arrX[a];
                            int y = j + arrY[a];
                            if (x >= 0 && x < n && y >= 0 && y < n && arr[x][y] == '*') {
                                count++;
                            }
                        }
                        check[i][j] = String.valueOf(count).charAt(0);
                    }
                } else {
                    check[i][j]='.';
                }
            }
        }

        if (key == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == '*') {
                        check[i][j] = '*';
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(check[i][j]);
            }
            System.out.println();
        }


    }
}
