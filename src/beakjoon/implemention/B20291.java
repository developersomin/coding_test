package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class B20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] str = s.split("\\.");
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }
        for (String x : map.keySet()) {
            System.out.println(x+" "+map.get(x));
        }

    }
}
