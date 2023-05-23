package programmers.lv2;


public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        char[] arr = dartResult.toCharArray();
        int index= -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                index++;
                score[index] = Integer.parseInt(String.valueOf(arr[i]));
                if (arr[i] == '1' && arr[i + 1] == '0') {
                    score[index] =10;
                    i++;
                }
            }else if (arr[i] == 'D') {
                score[index] = (int) Math.pow(score[index],2);
            } else if(arr[i] == 'T') {
                score[index] = (int) Math.pow(score[index],3);
            } else if (arr[i] == '*') { // 이전 라운드와 현재 라운드에 2배
                if (index > 0) score[index-1] *=2;
                score[index] *= 2;
            } else if (arr[i] == '#') { // 현재 라운드에 -1 곱하기
                score[index] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];
        return answer;


    }

    public static void main(String[] args) {
        DartGame T = new DartGame();
        String dartResult = "1S2D3T";
        System.out.println(T.solution(dartResult));

    }
}
