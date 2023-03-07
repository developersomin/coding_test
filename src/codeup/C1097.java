
package codeup;


import java.util.*;

public class C1097 {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];

        for(int i=0; i<19;i++){
            for(int j=0; j<19; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            for(int j=0; j<19; j++){
                if(arr[x][j]==1){
                    arr[x][j]=0;
                }

                else{
                    arr[x][j]=1;
                }
            }
            for(int j=0; j<19; j++){
                if(arr[j][y]==1){
                    arr[j][y]=0;
                }

                else{
                    arr[j][y]=1;
                }
            }
        }
        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

