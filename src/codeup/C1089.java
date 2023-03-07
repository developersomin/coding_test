package codeup;



import java.util.Scanner;

public class C1089 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        if(d==0){
            System.out.println(a);
        }
        else{
            System.out.println(d*(n-1)+a);
        }



    }
}
