package codeup;

import java.util.Scanner;

public class C1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String[] str=s.split("\\.");
        for(String a : str){
            System.out.println(a);
        }


    }
}

