package programmers.lv2;

public class RecommendId {
    static String tmp;
    public String solution(String new_id) {
        String answer = "dsa";
        first(new_id);
        second(tmp);
        third(tmp);
        fourth(tmp);
        fifth(tmp);
        sixth(tmp);
        seventh(tmp);
        answer=tmp;

        return answer;
    }
    public void first(String new_id){
        tmp= new_id.toLowerCase();
    }

    public void second(String new_id){
        String s = "~!@#$%^&*()=+[{]}:?,<>/";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < new_id.length(); i++) {
            if (Character.isDigit(new_id.charAt(i)) || Character.isAlphabetic(new_id.charAt(i))) {
                sb.append(new_id.charAt(i));
            } else{
                boolean delete = false;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == new_id.charAt(i)) {
                        delete=true;
                        break;
                    }
                }
                if(!delete){ //특수문자에 포함 안되면
                    sb.append(new_id.charAt(i));
                }
            }
        }
        tmp= sb.toString();
    }

    public void third(String new_id){
        
        while(true){
            int before = new_id.length();
            new_id = new_id.replace("..", ".");
            int after = new_id.length();
            if (before == after) {
                break;
            }
        }
        tmp=new_id;
    }

    public void fourth(String new_id){

        if (new_id.length() !=0 && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if (new_id.length() !=0  && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        tmp=new_id;

    }
    public void fifth(String new_id){
        if (new_id.length()==0) {
            tmp = "a";
        }
    }
    public void sixth(String new_id){
        if (new_id.length()>=16) {
            String after = new_id.substring(0, 15);
            if (after.charAt(14) == '.') {
                after=after.substring(0, 14);
            }
            tmp=after;
        }
    }

    public void seventh(String new_id){
        if (new_id.length()<=2) {
            while(true){
                new_id += new_id.charAt(new_id.length() - 1);
                if (new_id.length() == 3) {
                    break;
                }
            }
        }
        tmp=new_id;
    }


    public static void main(String[] args){
        RecommendId t = new RecommendId();
        String new_id = "a...a";
        System.out.println(t.solution(new_id));
    }
}
