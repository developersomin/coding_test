package programmers.lv2;

import java.util.Arrays;


public class MatrixEquation {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int z = 0; z < arr1[0].length; z++) {
                    answer[i][j]+=arr1[i][z] * arr2[z][j];
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        MatrixEquation T = new MatrixEquation();
        int[][] arr1 = {{2,3,2}, {4,2,4}, {3,1,4}};
        int[][] arr2 = {{5,4,3}, {2,4,1},{3,1,1}};
        System.out.println(Arrays.deepToString(T.solution(arr1, arr2)));

    }
}
