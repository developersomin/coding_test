package codeup;

import java.util.Scanner;

public class C1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str = s.split(" ");
        int a= Integer.parseInt(str[0]);
        int b= Integer.parseInt(str[1]);
        if(b!=a)
            System.out.println("1");
        else
            System.out.println("0");

    }
}