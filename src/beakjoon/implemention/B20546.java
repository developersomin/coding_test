package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int[] stockPrice = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            stockPrice[i] = Integer.parseInt(st.nextToken());
        }

        int[] a = new int[14];
        int[] b = new int[14];
        int moneyA = money;
        int moneyB = money;

        for (int i = 0; i < 14; i++) {
            a[i] = moneyA / stockPrice[i];
            moneyA = moneyA - a[i] * stockPrice[i];
            if (moneyA == 0) {
                break;
            }
        }


        for (int i = 3; i < 14; i++) {
            if (stockPrice[i-1] > stockPrice[i - 2] && stockPrice[i - 2] > stockPrice[i - 3]) {
                for (int j = 0; j < i; j++) {
                    moneyB=moneyB+b[j] * stockPrice[i];
                    b[j]=0;
                }
            }
            if (stockPrice[i-1] < stockPrice[i - 2] && stockPrice[i - 2] < stockPrice[i - 3]) {
                b[i] = moneyB / stockPrice[i];
                moneyB = moneyB - b[i] * stockPrice[i];
            }
        }

        int sumA=0;
        int sumB=0;

        for (int i = 0; i < 14; i++) {
            sumA += a[i] * stockPrice[13];
            sumB += b[i] * stockPrice[13];
        }
        if (sumA + moneyA > sumB + moneyB) {
            System.out.println("BNP");

        } else if (sumA + moneyA == sumB + moneyB) {
            System.out.println("SAMESAME");
        } else {
            System.out.println("TIMING");
        }
        br.close();


    }
}
