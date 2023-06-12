package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B22858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] index = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            index[i] = Integer.parseInt(st.nextToken());
        }
        int[] tmp = new int[n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                tmp[index[j] - 1] = arr[j];
            }

            arr=tmp.clone();
        }
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}
