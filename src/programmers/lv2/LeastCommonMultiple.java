package programmers.lv2;

public class LeastCommonMultiple {

    public int solution(int[] arr) {
        int answer = 0;
        answer = arr[1] * arr[0] / gcd(arr[1], arr[0]);
        for (int i = 2; i < arr.length; i++) {
            answer = arr[i] * answer / gcd(arr[i], answer);
        }


        return answer;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public static void main(String[] args) {
        LeastCommonMultiple T = new LeastCommonMultiple();

        int[] arr = {2, 6, 8, 14};
        System.out.println(T.solution(arr));

    }
}
