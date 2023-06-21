package programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class Keypad {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        makeMap(map);
        int left = (int)'*';
        int right= (int)'#';
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                sb.append("L");
                left=numbers[i];
            } else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                sb.append("R");
                right=numbers[i];
            } else{
                int lt = calc(map, left, numbers[i]);
                int rt = calc(map, right, numbers[i]);
                if(rt>lt){
                    sb.append("L");
                    left=numbers[i];
                } else if(rt<lt){
                    sb.append("R");
                    right=numbers[i];
                } else if(rt==lt){
                    if(hand.equals("right")){
                        sb.append("R");
                        right=numbers[i];
                    } else if(hand.equals("left")){
                        sb.append("L");
                        left=numbers[i];
                    }
                }
            }
        }
        answer = sb.toString();

        return answer;
    }


    public int calc(Map<Integer, String> map,int number,int cur) {
        String[] s = map.get(number).split(" ");
        int numberX = Integer.parseInt(s[0]);
        int numberY = Integer.parseInt(s[1]);
        s=map.get(cur).split(" ");
        int curX = Integer.parseInt(s[0]);
        int curY = Integer.parseInt(s[1]);
        return Math.abs(curX - numberX) + Math.abs(curY - numberY);


    }


    public void makeMap(Map<Integer, String> map) {
        int number =1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map.put(number, i + " " + j);
                number++;
            }
        }
        map.put((int) '*', 3 + " " + 0);
        map.put(0, 3 + " " + 1);
        map.put((int)'#', 3 + " " + 2);
    }

    public static void main(String[] args) {
        Keypad keypad = new Keypad();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(keypad.solution(numbers, hand));


    }
}
