package programmers.lv2;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {

        int answer = 0;

        Arrays.sort(citations); // 0, 1 , 3 ,5, 6 // citations.length 5개 -i-1
        for (int i = 0; i < citations.length; i++) {
            if (citations[i]>=citations.length - i ) {
                answer =citations.length - i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        HIndex T = new HIndex();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(T.solution(citations));

    }
}
