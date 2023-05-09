package programmers.lv1;

public class SmallSubstring {
    public int solution(String t, String p) {
        int answer=0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long tmp = Long.parseLong(t.substring(i, p.length() + i));
            if (tmp<=Long.parseLong(p)) {
                answer++;
            }
        }
       return answer;
    }

    public static void main(String[] args) {
        SmallSubstring T = new SmallSubstring();

        String t = "3141592";
        String p = "271";
        System.out.println(T.solution(t,p));

    }
}
