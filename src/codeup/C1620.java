package codeup;

import java.util.Scanner;

public class C1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            int sum = 0;
            while (true) {
                sum += n % 10;
                n = n / 10;
                if (n == 0 && (sum >=10)) {
                    n=sum;
                    sum=0;
                }
                if (n == 0 && (sum > 0 && sum < 10)) {
                    System.out.println(sum);
                    break;
                }
            }

    }
}

