package codeup;



import java.util.Scanner;

public class C1095 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        int min= sc.nextInt();
        for(int i=1; i<n; i++){
            arr[i]=sc.nextInt();
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println(min);

    }

}
