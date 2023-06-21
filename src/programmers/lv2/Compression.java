package programmers.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compression {
    public List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        int number=1;
        Map<String, Integer> map = new HashMap<>();

        for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
            map.put(String.valueOf((char)i),number);
            number++;
        }

        int prev=0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            sb.append(msg.charAt(i));
            if (map.containsKey(sb.toString())) {
                prev = map.get(sb.toString());
            } else {
                map.put(sb.toString(), number);
                number++;
                answer.add(prev);
                prev=0;
                sb.setLength(0);
                i--;
            }
        }

        if (prev != 0) {
            answer.add(prev);
        }



        return answer;
    }

    public static void main(String[] args) throws IOException {
        Compression T = new Compression();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(T.solution(br.readLine()).toString());

        br.close();

    }
}
