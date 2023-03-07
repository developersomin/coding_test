package codeup;



import java.util.Scanner;

public class C1092 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //최소공배수
        int i=1;
        while (true){
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
