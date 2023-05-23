package programmers.lv2;


public class PrimeNumber {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        String[] split = s.split("0");
        for (String str : split) {
            if (str.equals("")) {
                continue;
            }
            Long number = Long.parseLong(str);
            if (number > 1) {
                boolean primeNumber = true;
                for (int i = 2; i <=(int)Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        primeNumber = false;
                        break;
                    }
                }
                if (primeNumber) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        int n = 110011;
        int k =10;
        System.out.println(T.solution(n,k));

    }
}
