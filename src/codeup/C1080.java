package codeup;

import java.util.Scanner;

public class C1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while (true){

            sum+=i;
            if(sum>=n)
                break;
            i++;
        }
        System.out.println(i);

    }
}
