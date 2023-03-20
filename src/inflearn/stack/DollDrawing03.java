package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class DollDrawing03 {
    public int solution(int[][] board, int[] move) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : move) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp=board[i][pos - 1];
                    board[i][pos - 1]=0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DollDrawing03 dollDrawing03 = new DollDrawing03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int[] move = new int[x];
        for (int i = 0; i < x; i++) {
            move[i] = sc.nextInt();
        }
        System.out.println(dollDrawing03.solution(board,move));
    }
}
