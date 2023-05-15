package programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class HashClothes {
    public int solution(String[][] clothes) {

        int answer =1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        for (int x : map.values()) {
            answer = answer * (x+1);
        }
        answer = answer - 1;
        return answer;
    }

    public static void main(String[] args) {
        HashClothes T = new HashClothes();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(T.solution(clothes));

    }
}
