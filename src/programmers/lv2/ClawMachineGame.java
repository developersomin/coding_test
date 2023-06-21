package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
            int index = moves[i]-1;
            int findNumber = findNumber(board, index);
            if(findNumber!=-1){
                result.add(findNumber);
            }


            int size = result.size();
            if(size>=2){
                if (result.get(size - 1) == result.get(size - 2)) {
                    result.remove(size-1);
                    result.remove(size-2);
                    answer+=2;
                }
            }


        }
        return answer;
    }


    private int findNumber(int[][] board,int index) {
        int result=-1;
        for (int i = 0; i < board.length; i++) {
            if(board[i][index]!=0){
                result =board[i][index];
                board[i][index]=0;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ClawMachineGame clawMachineGame = new ClawMachineGame();
        int[][] board =    {{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}};
        int[] moves = {1,2,3,4};
        System.out.println(clawMachineGame.solution(board,moves));

    }
}
