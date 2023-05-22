package programmers.lv2;

public class Fatigue {
    static boolean[] visit;
    static int answer =-1;

    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visit = new boolean[dungeons.length];
        int cnt = 0;
        DFS(k, dungeons, cnt);


        return answer;
    }

    public void DFS(int k, int[][] dungeons,int cnt){
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                DFS(k - dungeons[i][1], dungeons, cnt + 1);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
    }


    public static void main(String[] args) {
        Fatigue T = new Fatigue();
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(T.solution(k,dungeons));
    }
}
