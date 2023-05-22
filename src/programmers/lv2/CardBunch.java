package programmers.lv2;

public class CardBunch {
    public String solution(String[] cards1,String[] cards2,String[] goal) {

        String answer = "YES";
        int index_cards1=0;
        int index_cards2=0;
        for (int i = 0; i < goal.length; i++) {
            if (index_cards1 < cards1.length && goal[i].equals(cards1[index_cards1])) {
                index_cards1++;
            } else if (index_cards2 < cards2.length && goal[i].equals(cards2[index_cards2])) {
                index_cards2++;
            } else {
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CardBunch T = new CardBunch();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(T.solution(cards1,cards2,goal));
    }
}
