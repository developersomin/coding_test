package inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram02 {
    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char x : str1.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        for (char key : str2.toCharArray()) {
            if (!hashMap.containsKey(key) || hashMap.get(key) == 0) {
                return answer = "NO";
            }
            hashMap.put(key, hashMap.get(key) - 1);

        }

        return answer;
    }

    public static void main(String[] args) {
        Anagram02 anagram02 = new Anagram02();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(anagram02.solution(str1,str2));


    }
}
