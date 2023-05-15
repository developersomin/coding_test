package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutArray {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        for (int i = 0; i < answer.length; i++) {
            int row = (int)((i+left) / n) + 1;
            int col = (int)((i+left) % n) + 1;
            answer[i] = Math.max(row, col);
        }


        return answer;
    }


    public static void main(String[] args) {
        CutArray T = new CutArray();
        int n = 4;
        long left = 7;
        long right = 14;

        System.out.println(Arrays.toString(T.solution(n,left,right)));

    }
}
