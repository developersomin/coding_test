package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < str1.length()-1; i++) {
            char first  = str1.charAt(i);
            char second = str1.charAt(i + 1);

            if (first <= 'z' && first >= 'a' && second <= 'z' && second >= 'a') {
                list1.add((first + "" + second));
            }
        }


        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < str2.length()-1; i++) {
            char first  = str2.charAt(i);
            char second = str2.charAt(i + 1);

            if (first <= 'z' && first >= 'a' && second <= 'z' && second >= 'a') {
                list2.add((first + "" + second));
            }
        }
        List<String> union = new ArrayList<>();
        List<String> intersection = new ArrayList<>();

        for (String s : list2) {
            if (list1.contains(s)) {
                list1.remove(s);
                intersection.add(s);
            }
            union.add(s);
        }
        for (String s : list1) {
            union.add(s);
        }

        if (union.size()==intersection.size()) {
            answer = 65536;
        } else {
            float jaked = (float) intersection.size() / union.size();
            answer = (int) (jaked * 65536);
        }
        return answer;
    }




    public static void main(String[] args) {
        NewsClustering T = new NewsClustering();
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        System.out.println(T.solution(str1,str2));
    }
}
