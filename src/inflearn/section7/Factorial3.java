package inflearn.section7;

public class Factorial3 {
    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*DFS(n-1);
        }
    }


    public static void main(String[] args) {
        Factorial3 T = new Factorial3();
        System.out.println(T.DFS(5));
        ;
    }
}
