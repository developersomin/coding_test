package programmers.lv2;

public class Cola {

    public int solution(int a, int b, int n) {

        int answer =0;
        while (true) {
            int r;

            answer += n / a * b;

            r = n % a;
            n = n / a * b + r;


            if (n < a) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Cola T = new Cola();

        int a = 3;
        int b = 1;
        int n = 20;
        System.out.println(T.solution(a,b,n));

    }
}
