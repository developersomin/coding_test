package codeup;

import java.util.Scanner;

public class C1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str= s.split("\\-");
        for(String x : str)
            System.out.print(x);
    }
}

