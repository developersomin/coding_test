package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        if (str[0].equals("0")) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case "0":
                    sb.append("000");
                    break;
                case "1":
                    if(i==0){
                        sb.append("1");
                    }else {
                        sb.append("001");
                    }
                    break;
                case "2":
                    if(i==0){
                        sb.append("10");
                    }else {
                        sb.append("010");
                    }
                    break;
                case "3":
                    if(i==0){
                        sb.append("11");
                    }else {
                        sb.append("011");
                    }
                    break;
                case "4":
                    sb.append("100");
                    break;
                case "5":
                    sb.append("101");
                    break;
                case "6":
                    sb.append("110");
                    break;
                case "7":
                    sb.append("111");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
