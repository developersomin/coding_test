package programmers.lv2;

public class RepresentationOfNumbers {
    public int solution(int n) {

        int answer = 0;
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;

    }




    public static void main(String[] args) {
        RepresentationOfNumbers T = new RepresentationOfNumbers();
        int n = 15;

        System.out.println(T.solution(n));
    }
}
