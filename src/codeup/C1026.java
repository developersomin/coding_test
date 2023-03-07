package codeup;

import java.util.Scanner;

public class C1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str= s.split("\\:");
        System.out.println(Integer.parseInt(str[1]));
    }
}

