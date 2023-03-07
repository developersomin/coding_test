package codeup;

import java.util.Scanner;

public class C1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str= s.split("\\.");
        int year=Integer.parseInt(str[0]);
        int month=Integer.parseInt(str[1]);
        int day=Integer.parseInt(str[2]);
        System.out.printf("%04d.%02d.%02d",year,month,day);


    }
}

