package programmers.lv2;

import java.util.Arrays;

public class Friends4Block {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] arr = new char[m][n];
        for (int i = 0; i < m; i++) {
            arr[i] = board[i].toCharArray();
        }


        while(true){
            int cnt = checkBlock(m, n, arr);
            if(cnt ==0){
                break;
            }
            answer += cnt;
            dropBlock(m,n,arr);

        }
        return answer;
    }

    public void dropBlock(int m, int n,char[][] arr){
        for (int j = 0; j < n; j++) {
            for (int i = m - 1; i >= 1; i--) {
                if (arr[i][j] == '.') {
                    for (int z = i-1; z >= 0; z--) {
                        if (arr[z][j] != '.') {
                            arr[i][j] = arr[z][j];
                            arr[z][j] ='.';
                            break;
                        }

                    }
                }
            }

        }
    }

    public int checkBlock(int m, int n, char[][] arr) {
        int count=0;
        boolean[][] block = new boolean[m][n];
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n- 1; j++) {
                if(arr[i][j]!='.'){
                    checkFour(i, j, arr, arr[i][j],block);
                }
                }
            }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (block[i][j]) {
                    arr[i][j] = '.';
                    count++;
                }
            }

        }

        return count;
    }

    public void checkFour(int i,int j,char[][] arr,char checkChar,boolean[][] block) {
        boolean allFour=true;

        //옆 아래 대각선 확인
        for (int x = i; x < i + 2; x++) {
            for (int y = j; y < j + 2; y++) {
                if (checkChar != arr[x][y]) {
                    allFour = false;
                    break;
                }
            }
        }
        if(allFour){
            for (int x = i; x < i + 2; x++) {
                for (int y = j; y < j + 2; y++) {
                    block[x][y]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Friends4Block friends4Block = new Friends4Block();
        int m = 6;
        int n = 6;
        String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        System.out.println(friends4Block.solution(m,n,board));
    }
}
