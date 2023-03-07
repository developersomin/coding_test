package codeup;

import java.util.Scanner;

public class C1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            System.out.println("'" + str[i] + "'");
        }
    }
}

