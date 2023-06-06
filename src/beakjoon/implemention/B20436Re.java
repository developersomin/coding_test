package beakjoon.implemention;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
class KeyPoint{
    int x;
    int y;

    public KeyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class B20436Re {
    static HashMap<Character, KeyPoint> leftKeyboard = new HashMap<>();
    static HashMap<Character, KeyPoint> rightKeyboard = new HashMap<>();

    static void makeKeyboard(){
        //1줄
        leftKeyboard.put('q',new KeyPoint(0,0));
        leftKeyboard.put('w',new KeyPoint(1,0));
        leftKeyboard.put('e',new KeyPoint(2,0));
        leftKeyboard.put('r',new KeyPoint(3,0));
        leftKeyboard.put('t',new KeyPoint(4,0));
        rightKeyboard.put('y',new KeyPoint(5,0));
        rightKeyboard.put('u',new KeyPoint(6,0));
        rightKeyboard.put('i',new KeyPoint(7,0));
        rightKeyboard.put('o',new KeyPoint(8,0));
        rightKeyboard.put('p',new KeyPoint(9,0));
        //2줄
        leftKeyboard.put('a',new KeyPoint(0,1));
        leftKeyboard.put('s',new KeyPoint(1,1));
        leftKeyboard.put('d',new KeyPoint(2,1));
        leftKeyboard.put('f',new KeyPoint(3,1));
        leftKeyboard.put('g',new KeyPoint(4,1));
        rightKeyboard.put('h',new KeyPoint(5,1));
        rightKeyboard.put('j',new KeyPoint(6,1));
        rightKeyboard.put('k',new KeyPoint(7,1));
        rightKeyboard.put('l',new KeyPoint(8,1));
        //3줄
        leftKeyboard.put('z',new KeyPoint(0,2));
        leftKeyboard.put('x',new KeyPoint(1,2));
        leftKeyboard.put('c',new KeyPoint(2,2));
        leftKeyboard.put('v',new KeyPoint(3,2));
        rightKeyboard.put('b',new KeyPoint(4,2));
        rightKeyboard.put('n',new KeyPoint(5,2));
        rightKeyboard.put('m',new KeyPoint(6,2));
    }

    static int calc(char sl, char sr, String str) {
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            if (leftKeyboard.containsKey(str.charAt(i))) {
                KeyPoint curKey = leftKeyboard.get(sl);
                KeyPoint nextKey = leftKeyboard.get(str.charAt(i));
                result += (Math.abs(curKey.x - nextKey.x) + Math.abs(curKey.y - nextKey.y));
                result++;
                sl = str.charAt(i);
            } else{
                KeyPoint curKey = rightKeyboard.get(sr);
                KeyPoint nextKey = rightKeyboard.get(str.charAt(i));
                result += (Math.abs(curKey.x - nextKey.x) + Math.abs(curKey.y - nextKey.y));
                result++;
                sr = str.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char sl = st.nextToken().charAt(0);
        char sr = st.nextToken().charAt(0);
        String str = br.readLine();
        makeKeyboard();
        System.out.println(calc(sl, sr, str));

    }
}
