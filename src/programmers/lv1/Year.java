package programmers.lv1;


import java.util.Calendar;

public class Year {
    public String solution(int a, int b) {

        String answer = "";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,a-1,b);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                answer= "SUN";
                break;
            case 2:
                answer= "MON";
                break;
            case 3:
                answer= "TUE";
                break;
            case 4:
                answer= "WED";
                break;
            case 5:
                answer= "THU";
                break;
            case 6:
                answer= "FRI";
                break;
            case 7:
                answer= "SAT";
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Year T = new Year();

        int a = 5;
        int b = 24;
        System.out.println(T.solution(a,b));

    }
}
