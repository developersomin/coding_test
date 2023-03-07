package codeup;

import java.util.Scanner;

public class C1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money=sc.nextInt();

        int[] x={10000,1000,100,10,1};
        for(int i=0; i<5; i++){
            System.out.println("["+(money-(money%x[i]))+"]");
            money=money-((money/x[i])*x[i]);

        }


    }
}

