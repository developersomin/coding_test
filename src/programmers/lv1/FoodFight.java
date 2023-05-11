package programmers.lv1;

public class FoodFight {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        answer = sb.toString()+"0"+sb.reverse().toString();



        return answer;

    }

    public static void main(String[] args) {
        FoodFight T = new FoodFight();
        int[] food = {1, 7, 1, 2};
        System.out.println(T.solution(food));

    }
}
