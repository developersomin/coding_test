package inflearn.section7;

public class Recursive1 {

    public void solution(int n){
        DFS(n);
    }

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }


    public static void main(String[] args) {
        Recursive1 T = new Recursive1();
        T.solution(3);
    }
}
