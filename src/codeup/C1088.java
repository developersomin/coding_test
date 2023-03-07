package codeup;



import java.util.Scanner;

public class C1088 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        for(int i=1; i<=w; i++){
            if(i%3==0)
                continue;
            else
                System.out.print(i+" ");
        }

    }
}
