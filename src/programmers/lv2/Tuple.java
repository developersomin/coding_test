package programmers.lv2;

import java.util.*;

public class Tuple {

    public int[] solution(String s) {
        String tmp = s.substring(2, s.length() - 2);
        String[] str = tmp.split("\\},\\{");
        List<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            String[] arr_str = str[i].split(",");
            ArrayList<Integer> a = new ArrayList<>();
            for (String x : arr_str) {
                a.add(Integer.parseInt(x));
            }
            list.add(a);
        }
        Collections.sort(list, (o1, o2) -> o1.size() - o2.size());
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (int x : list.get(i)) {
                if (!set.contains(x)) {
                    answer[i]=x;
                    set.add(x);
                    break;
                }
            }

        }


        return answer;
    }


    public static void main(String[] args) {
        Tuple T = new Tuple();
        int n = 2;
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        System.out.println(Arrays.toString(T.solution(s)));

    }
}
