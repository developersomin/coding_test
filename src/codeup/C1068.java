package codeup;

import java.util.Scanner;

public class C1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if(a>=90&&a<=100)
            System.out.println("A");
        else if(a>=70&&a<=89)
            System.out.println("B");
        else if(a>=40&&a<=69)
            System.out.println("C");
        else
            System.out.println("D");
    }
}