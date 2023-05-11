package programmers.lv2;

import java.util.*;

public class PickingOranges {
    public int solution(int k, int[] tangerine) {

        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            k = k - entry.getValue();
            answer++;
            if (k <= 0) {
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        PickingOranges T = new PickingOranges();

        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(T.solution(k,tangerine));

    }
}
