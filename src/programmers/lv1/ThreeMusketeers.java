package programmers.lv1;

public class ThreeMusketeers {
    public int solution(int[] arr) {
        int answer =0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int z = j+1; z < arr.length; z++) {
                    if (arr[i] + arr[j] + arr[z] == 0) {
                        answer++;
                    }
                }

            }
        }
        return answer;
    }


    public static void main(String[] args) {
        ThreeMusketeers T = new ThreeMusketeers();
        int[] arr = {-1, 1, -1, 1};

        System.out.println(T.solution(arr));
    }
}
