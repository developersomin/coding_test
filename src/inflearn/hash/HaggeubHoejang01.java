package inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

public class HaggeubHoejang01 {

    public char solution(int n, String str) {
        char answer=' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char x : str.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        int max=-1;

        for (char x : hashMap.keySet()) {
            if (hashMap.get(x) > max) {
                max = hashMap.get(x);
                answer=x;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        HaggeubHoejang01 haggeubHoejang01 = new HaggeubHoejang01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(haggeubHoejang01.solution(n,str));


    }
}
