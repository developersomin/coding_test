package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2578 {

    static int[][] bingGo;


    public static void check(int a){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bingGo[i][j] == a) {
                    bingGo[i][j]=0;
                    return;
                }
            }
        }
    }
    public static int checkX(){
        int count =0;
        for (int i = 0; i < 5; i++) {
            boolean result =true;
            for (int j = 0; j < 5; j++) {
                if (bingGo[i][j] != 0) {
                    result = false;
                }
            }
            if (result) {
                count++;
            }
        }
        return count;

    }

    public static int checkY(){
        int count =0;
        for (int j = 0; j < 5; j++) {
            boolean result =true;
            for (int i = 0; i < 5; i++) {
                if (bingGo[i][j] != 0) {
                    result = false;
                }
            }
            if (result) {
                count++;
            }
        }
        return count;

    }
    public static int checkLeftXY(){
        boolean result = true;
        for (int i = 0; i < 5; i++) {
            if (bingGo[i][i] != 0) {
                result = false;
                break;
            }
        }
        if (result) {
            return 1;
        }
        return 0;
    }
    public static int checkRightXY(){
        boolean result = true;
        for (int i = 0; i < 5; i++) {
            if (bingGo[i][4-i] != 0) {
                result = false;
                break;
            }
        }
        if (result) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bingGo = new int[5][5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingGo[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        int answer=0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                answer++;
                check(Integer.parseInt(st.nextToken()));
                int count = checkX() + checkY() + checkLeftXY() + checkRightXY();
                if (count >= 3) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }
}
