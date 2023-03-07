package codeup;


import java.util.*;

public class C1096 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[20][20];
        int n = sc.nextInt();
        for(int i=0; i<5; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[a-1][b-1]=1;
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
