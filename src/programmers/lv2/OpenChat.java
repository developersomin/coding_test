package programmers.lv2;

import java.util.*;

public class OpenChat {
    static Map<String, String> nickname = new HashMap<>();
    static List<String> cmd = new ArrayList<>();
    static List<String> id = new ArrayList<>();

    static void parse(String[] record) {
        for (int i = 0; i < record.length; i++) {
            String[] s = record[i].split(" ");
            switch (s[0]) {
                case "Enter":
                    cmd.add("님이 들어왔습니다.");
                    id.add(s[1]);
                    nickname.put(s[1], s[2]);
                    break;
                case "Leave":
                    cmd.add("님이 나갔습니다.");
                    id.add(s[1]);
                    break;
                case "Change":
                    nickname.put(s[1], s[2]);
                    break;
            }
        }

    }

    public String[] solution(String[] record) {

        parse(record);
        String[] answer = new String[cmd.size()];
        int index = 0;
        for(String s : cmd){
            String str = nickname.get(id.get(index)) + s;
            answer[index]=str;
            index++;
        }

        return answer;
    }


    public static void main(String[] args) {
        OpenChat T = new OpenChat();
        String[] record = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};

        System.out.println(Arrays.toString(T.solution(record)));


    }
}
