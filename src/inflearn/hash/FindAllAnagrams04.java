package inflearn.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)
        S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하
        세요. 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
        ▣ 입력설명
        첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
        S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
        ▣ 출력설명
        S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
        ▣ 입력예제 1
        bacaAacba
        abc
        ▣ 출력예제 1
        3
*/

public class FindAllAnagrams04 {

    public int solution(String str1, String str2) {

       int answer= 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x : str2.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);
        }
        int lp=0;
        for (int rp = str2.length() - 1; rp < str1.length(); rp++) {
            am.put(str1.charAt(rp), am.getOrDefault(str1.charAt(rp), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(str1.charAt(lp), am.get(str1.charAt(lp)) - 1);
            if (am.get(str1.charAt(lp)) == 0) {
                am.remove(str1.charAt(lp));
            }
            lp++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindAllAnagrams04 findAllAnagrams04 = new FindAllAnagrams04();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(findAllAnagrams04.solution(str1,str2));
    }
}
