package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            list.add(i);
        }
        for (int i = 0; i < 28; i++) {
            list.remove(Integer.valueOf(Integer.parseInt(br.readLine())));
        }
        Collections.sort(list);
        for (int x : list) {
            System.out.println(x);
        }

    }
}
