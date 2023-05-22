package programmers.lv2;

import java.util.*;

public class FailureRate {

    public int[] solution(int n, int[] stages) {

        int[] stay  = new int[n + 2];
        for (int i = 0; i < stages.length; i++) {
            stay[stages[i]]++;
        }

        Map<Integer, Double> map = new HashMap<>();
        int denominator = stages.length; //분모
        for (int i = 1; i < n + 1; i++) {
            denominator = denominator - stay[i - 1];
            map.put(i, (double) stay[i] / denominator);
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        int[] answer =new int[keySet.size()];
        int count=0;
        for (int key : keySet) {
            answer[count] =key;
            count++;
        }


        return answer;
    }



    public static void main(String[] args) {
        FailureRate T = new FailureRate();
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(T.solution(n,stages)));
    }
}
