package codeup;



import java.util.Scanner;

public class C1085 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        long middle = (long)h*b*c*s;

        double result=(double) middle/(8*1024*1024);

        System.out.printf("%.1f MB",result);


    }
}
