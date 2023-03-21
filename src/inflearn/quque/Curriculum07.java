package inflearn.quque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum07 {

    public String solution(String a, String b) {

        Queue<Character> queue = new LinkedList<>();
        for (char c : a.toCharArray()) {
            queue.offer(c);
        }
        for (char c : b.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Curriculum07 curriculum07 = new Curriculum07();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        System.out.println(curriculum07.solution(a,b));
    }
}
