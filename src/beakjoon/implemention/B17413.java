package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder add = new StringBuilder();
        String s = br.readLine();
        boolean open =false;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && (int)s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                add.append(s.charAt(i));
            } else if (s.charAt(i) == ' ' && open == false) {
                sb.append(add.reverse());
                sb.append(s.charAt(i));
                add.setLength(0);
            }else if (s.charAt(i) == ' ' && open == true) {
                add.append(s.charAt(i));
            }
            else if (s.charAt(i) == '<') {
                sb.append(add.reverse());
                add.setLength(0);
                add.append(s.charAt(i));
                open = true;
            } else if (s.charAt(i) == '>') {
                add.append(s.charAt(i));
                sb.append(add);
                add.setLength(0);
                open = false;
            }
        }
        sb.append(add.reverse());
        System.out.println(sb.toString());


    }
}
