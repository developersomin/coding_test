package codeup;



import java.util.Scanner;

public class C1094 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=arr.length-1; i>=0; i--){
            arr[i] = sc.nextInt();
        }
        for (int x : arr){
            System.out.print(x+" ");
        }

    }

}
