package programmers.lv1;



public class Average {

    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        answer = answer / arr.length;
        return answer;
    }


    public static void main(String[] args) {
        Average T = new Average();
        int[] arr = {1, 2, 3, 4};

        System.out.println(T.solution(arr));
    }
}
