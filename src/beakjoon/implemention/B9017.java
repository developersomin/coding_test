package beakjoon.implemention;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B9017 {
    public static void main(String[] args) throws IOException {
        List<Integer> answer = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int match = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < match; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();


            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            for (int x = 1; x < 201; x++) {
                if (Collections.frequency(list,Integer.valueOf(x))<6) {
                    while (list.contains(Integer.valueOf(x))) {
                        list.remove(Integer.valueOf(x));
                    }
                }
            }
            int rank=1;
            int minScore=1111111;
            boolean duplication = false;
            int index=0;
            int[][] score = new int[201][2];
            for (int a = 0; a < list.size(); a++) {

                score[list.get(a)][1] ++;
                if(score[list.get(a)][1]==5){
                    for (int b = 1; b < 201; b++) {
                        if (score[b][0] < minScore &&score[b][1]==4) {
                            minScore = score[b][0];
                            index = b;
                            duplication = false;
                        } else if (score[b][0] == minScore && score[b][1] == 4) {
                            duplication = true;
                        }
                    }
                    if (duplication) {
                        System.out.println(list.get(a));
                        break;
                    } else {
                        System.out.println(index);
                        break;
                    }
                }

                score[list.get(a)][0] = rank;

                rank++;
            }
        }




    }
}
