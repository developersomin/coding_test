package programmers.lv2;

public class NextBigNumber {

    public int solution(int n) {
        int num=0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                num++;
            }
        }
        while (true) {
            n++;
            int tmp=0;
            String str = Integer.toBinaryString(n);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    tmp++;
                }
            }
            if (num == tmp) {
                break;
            }
        }



        return n;



    }




    public static void main(String[] args) {
        NextBigNumber T = new NextBigNumber();
        int n = 78;

        System.out.println(T.solution(n));
    }
}
