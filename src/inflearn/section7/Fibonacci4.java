package inflearn.section7;

public class Fibonacci4 {
    static int[] arr;
    public int DFS(int n) {
        if (n == 1) {
            return arr[n]=1;
        } else if (n == 2) {
            return arr[n]=1;
        } else if (arr[n] > 0) {
            return arr[n];
        } else {
            return arr[n] = DFS(n - 2) + DFS(n - 1);
        }

    }


    public static void main(String[] args) {
        Fibonacci4 T = new Fibonacci4();
        int n= 10;
        arr = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
