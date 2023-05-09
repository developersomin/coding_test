package programmers.lv2;

public class JumpTeleport {
    public int solution(long n) {
        int answer = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n - 1) / 2;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        JumpTeleport T = new JumpTeleport();

        long n = 5000;
        System.out.println(T.solution(n));

    }
}
