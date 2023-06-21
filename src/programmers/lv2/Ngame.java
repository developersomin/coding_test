package programmers.lv2;

public class Ngame {
    static String arrNumber(int n, int t,int m){
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(true){
            sb.append(Integer.toString(i, n));
            if(sb.length()>=t*m){
                break;
            }
            i++;
        }

        return sb.toString();
    }

    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        String arr = arrNumber(n, t, m);
        System.out.println(arr);
        int start = p-1;
        int end = m*t;
        for (int i =start; i < end; i = i + m) {
            sb.append(arr.charAt(i));
        }
        answer = sb.toString().toUpperCase();


        return answer;
    }



    public static void main(String[] args) {
        Ngame T = new Ngame();
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        System.out.println(T.solution(n, t, m, p));


    }
}
