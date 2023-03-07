package codeup;



import java.util.Scanner;

public class C1087 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int i=1;
        int sum=0;
        while (true) {
            sum+=i;
            if(sum>=w)
                break;
            i++;
        }
        System.out.println(sum);

    }
}
