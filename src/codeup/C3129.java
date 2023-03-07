package codeup;

import java.util.Scanner;
import java.util.Stack;

public class C3129 {

    public boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(')
                stack.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                if(stack.empty())
                    return false;
                stack.pop();
            }
        }
        return stack.empty();

    }
    public static void main(String[] args) {
        C3129 c3129 = new C3129();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(c3129.solution(s))
            System.out.println("good");
        else
            System.out.println("bad");
    }
}
