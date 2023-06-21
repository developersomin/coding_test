package programmers.lv2;

import java.util.*;

public class SortOfFile {



    public String[] solution(String[] files) {
        String[] answer = {};
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];

                int result = head1.toLowerCase().compareTo(head2.toLowerCase());
                if(result==0){
                    result = convertNum(o1, head1) - convertNum(o2, head2);
                }
                return result;
            }
        });
        return files;
    }
    public int convertNum(String str, String head){
        String substring = str.substring(head.length());
        String number="";
        for (char a : substring.toCharArray()) {
            if (Character.isDigit(a) && number.length() < 5) {
                number+=a;
            }
        }
        return Integer.parseInt(number);
    }

    public static void main(String[] args) {
        SortOfFile sortOfFile = new SortOfFile();
        String[] files = {"img12.png",
                "img10.png",
                "img02.png",
                "img1.png",
                "IMG01.GIF",
                "img2.JPG"};
        System.out.println(Arrays.toString(sortOfFile.solution(files)));

    }
}
