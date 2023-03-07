package codeup;

import java.util.Scanner;

public class C1859 {
    public void printStar(int current) {
        if(current<=0){
            return;
        }
        System.out.print("*");
        printStar(current-1);
    }
    public void loop(int current, int n){
        if(current>n)
            return;
        printStar(current);
        System.out.println();
        loop(current + 1, n);
    }
    public static void main(String[] args) {
        C1859 c1859 = new C1859();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c1859.loop(1,n);
    }
}
