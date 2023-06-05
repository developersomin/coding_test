package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int student = Integer.parseInt(br.readLine());
        for (int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());
            String gender = st.nextToken();
            int number = Integer.parseInt(st.nextToken());
            if (gender.equals("1")) {
                for (int j = number; j <= n; j = j + number) {
                    if (arr[j] == 1) {
                        arr[j] = 0;
                    } else {
                        arr[j] = 1;
                    }
                }
            } else {
                if (arr[number] == 1) {
                    arr[number] = 0;
                } else {
                    arr[number] = 1;
                }
                int right=number+1;
                int left=number-1;
                while (right <= n && left > 0) {
                    if (arr[right] == arr[left]) {
                        if (arr[right] == 1) {
                            arr[right] = 0;
                            arr[left] = 0;
                        } else {
                            arr[right] = 1;
                            arr[left] = 1;
                        }
                        right++;
                        left--;
                    } else {
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(arr[i]);
            sb.append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());

    }
}
