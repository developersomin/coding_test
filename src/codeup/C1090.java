package codeup;



import java.util.Scanner;

public class C1090 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        long sum =a;
        for (int i = 2; i <= n; i++) {
            sum=sum*r;
        }
        System.out.println(sum);


    }
}
