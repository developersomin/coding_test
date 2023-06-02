package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int count=0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if ((b == 1 && arr[a] == 0) || (b == 0 && arr[a] == 1)) {
                count++;
            }
            arr[a]=b;
        }
        System.out.println(count);
    }
}
