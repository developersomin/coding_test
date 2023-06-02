package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B21918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            switch (a) {
                case 1:
                    str[b - 1] = String.valueOf(c);
                    break;
                case 2:
                    for (int j = b - 1; j < c; j++) {
                        if (str[j].equals("0")) {
                            str[j] = "1";
                        } else {
                            str[j] = "0";
                        }
                    }
                    break;
                case 3:
                    for (int j = b - 1; j < c; j++) {
                        str[j] = "0";
                    }
                    break;

                case 4:
                    for (int j = b - 1; j < c; j++) {
                        str[j] = "1";
                    }
                    break;
            }
        }
        for (String s : str) {
            System.out.print(s+" ");
        }

    }
}
