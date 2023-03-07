package codeup;

import java.util.Scanner;

public class C1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(16);
        for(int i =1; i<16; i++)
            System.out.printf("%X*%X=%X\n",n,i,n*i);//%x 16진수 정수의 형식으로 출력
    }
}
