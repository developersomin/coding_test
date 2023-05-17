package inflearn.section7;

public class Dfs6 {
    static int n;
    static int[] arr;
    public void DFS(int l) {
        if (l == n+1) {
            String tmp = "";
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == 1) {
                    tmp += i + " ";
                }
            }
            System.out.println(tmp);
        } else {
            arr[l] = 1;
            DFS(l + 1);
            arr[l] = 0;
            DFS(l + 1);

        }
    }


    public static void main(String[] args) {
        Dfs6 T = new Dfs6();
        n = 3;
        arr = new int[n + 1];
        T.DFS(1);

    }
}
