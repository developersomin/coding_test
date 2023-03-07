package codeup;

import java.util.Scanner;

public class C1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hexa=Integer.parseInt(s,16);
        String octal=Integer.toOctalString(hexa);
        System.out.println(octal);
    }
}

