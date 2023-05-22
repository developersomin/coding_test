package programmers.lv2;

public class TargetNumber {

    int answer;

    public int solution(int[] numbers, int target) {

        answer =0;
        DFS(numbers, target, 0, 0);
        return answer;
    }

    public void DFS(int[] numbers, int target, int index, int sum){
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        DFS(numbers,target,index+1,sum+numbers[index]);
        DFS(numbers,target,index+1,sum-numbers[index]);
    }


    public static void main(String[] args) {
        TargetNumber T = new TargetNumber();
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        System.out.println(T.solution(numbers,target));
    }
}
