package inflearn.section7;

public class Recursive2 {

    public void solution(int n){
        DFS(n);
    }

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }


    public static void main(String[] args) {
        Recursive2 T = new Recursive2();
        T.solution(11);
    }
}
