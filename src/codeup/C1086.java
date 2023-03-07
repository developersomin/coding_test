package codeup;



import java.util.Scanner;

public class C1086 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        long middle = (long)w*h*b;

        double result=(double) middle/(8*1024*1024);

        System.out.printf("%.2f MB",result);


    }
}
