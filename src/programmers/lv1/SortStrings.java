package programmers.lv1;

import java.util.*;

public class SortStrings {
    public String[] solution(String[] str, int n) {
        String[] answer = new String[str.length];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            list.add(str[i].charAt(n) + str[i]);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        SortStrings T = new SortStrings();

        String[] str = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(T.solution(str,n)));

    }
}
