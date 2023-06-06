package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20436 {
    static char[][] arr = {{'z', 'x', 'c', 'v', 'b', 'n', 'm',' ', ' ',' '},
            {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',' '},
            {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}};

    static int cal(char curC,char nextC){
        int curX= 0;
        int nextX= 0;
        int curY=0;
        int nextY=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[2].length; j++) {
                if (curC == arr[i][j]) {
                    curY=i;
                    curX=j;
                }
                if (nextC == arr[i][j]) {
                    nextY=i;
                    nextX=j;
                }
            }
        }

        int x = Math.abs(curX - nextX);
        int y = Math.abs(curY - nextY);
        return x + y + 1;
    }
    public static void main(String[] args) throws IOException {

        char[] leftArr= {'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c'};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char left = st.nextToken().charAt(0);
        char right = st.nextToken().charAt(0);
        int sum=0;


        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            boolean leftOrRight=false;
            for (int j = 0; j < leftArr.length; j++) {
                if (str.charAt(i) == leftArr[j]) {
                    leftOrRight=true;
                    break;
                }
            }
            if(leftOrRight){
                sum += cal(left,str.charAt(i));
                left = str.charAt(i);
            } else {
                sum += cal(right,str.charAt(i));
                right = str.charAt(i);
            }
        }
        System.out.println(sum);
        br.close();


    }
}
