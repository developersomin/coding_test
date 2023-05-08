package inflearn.quque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom08 {
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
        EmergencyRoom08 emergencyRoom08 = new EmergencyRoom08();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        System.out.println(emergencyRoom08.solution(a,b));
    }
}
