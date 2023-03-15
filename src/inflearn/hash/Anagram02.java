package inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

/*아나그램(해쉬)
        Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아
        나그램이라고 합니다.
        예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면
        A(2), a(1), b(1), C(1), e(2)로 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재
        배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
        길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세
        요. 아나그램 판별시 대소문자가 구분됩니다.
        ▣ 입력설명
        첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
        단어의 길이는 100을 넘지 않습니다.
        ▣ 출력설명
        두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
        ▣ 입력예제 1
        AbaAeCe
        baeeACA
        ▣ 출력예제 1
        YES
        ▣ 입력예제 2
        abaCC
        Caaab
        ▣ 출력예제 2
        NO*/

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
