package programmers.lv1;

public class KakaoEnglishWord {

    public int solution(String t) {
        int answer=0;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < str.length; i++) {
            t=t.replace(str[i], Integer.toString(i));
        }
        answer=Integer.parseInt(t);
        return answer;
    }

    public static void main(String[] args) {
        KakaoEnglishWord T = new KakaoEnglishWord();

        String t = "one4seveneight";
        System.out.println(T.solution(t));

    }
}
