package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[20];

            sb.append(st.nextToken()).append(" ");
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < arr.length; j++) {
                for (int z = 0; z < j; z++) {
                    if (arr[j] < arr[z]) {
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb.toString());
    }
}
