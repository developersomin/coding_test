package codeup;

import java.util.Scanner;

public class C1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str = s.split(" ");
        int a= Integer.parseInt(str[0]);
        int b= Integer.parseInt(str[1]);

        int result = a*(int)Math.pow(2,b);

        System.out.println(result);

    }
}

