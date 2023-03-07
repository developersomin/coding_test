package codeup;


import java.util.Scanner;

public class C2081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        int max = a[0];
        int count=1;

        for(int i=1; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
                count=i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}

