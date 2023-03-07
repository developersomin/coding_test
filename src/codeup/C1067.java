package codeup;

import java.util.Scanner;

public class C1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if(a<0)
            System.out.println("minus");
        else
            System.out.println("plus");
        if (a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}