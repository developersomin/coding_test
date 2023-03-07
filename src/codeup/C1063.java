package codeup;

import java.util.Scanner;

public class C1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str = s.split(" ");
        int a= Integer.parseInt(str[0]);
        int b= Integer.parseInt(str[1]);
        System.out.println(a>b?a:b);


    }
}