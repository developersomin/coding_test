package codeup;

import java.util.Scanner;

public class C1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str = s.split(" ");
        int a= Integer.parseInt(str[0]);
        int b= Integer.parseInt(str[1]);
        int c= Integer.parseInt(str[2]);
        if(a%2==0)
            System.out.println(a);
        if(b%2==0)
            System.out.println(b);
        if(c%2==0)
            System.out.println(c);


    }
}