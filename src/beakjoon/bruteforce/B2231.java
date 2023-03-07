package beakjoon.bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2231 {
    public int solution(int n){
        for (int i = 0; i <n; i++) {
            int number = i;
            List<Integer> array = new ArrayList<>();
            while (number > 0) {
                array.add(number % 10);
                number = number / 10;
            }
            if(sum(i, array)==n){
                return i;
            }
        }
        return 0;
    }

    public int sum(int n, List<Integer> array){
        int sum=n;
        for (int i = array.size()-1; i >= 0; i--) {
            sum += array.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        B2231 b2231 = new B2231();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(b2231.solution(n));
    }
}
