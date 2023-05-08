package programmers.lv2;

public class FibonacciNum {

    public long solution(int n) {

        long[] arr = new long[n + 1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2])%1234567L;
        }
        return arr[n];
    }


  /*  public long solution(int n) {
        return fibonacci(n) % 1234567;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }*/




    public static void main(String[] args) {
        FibonacciNum T = new FibonacciNum();
        int n = 5;

        System.out.println(T.solution(n));
    }
}
