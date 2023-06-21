package programmers.lv2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ParkingFee {
    public int[] solution(int[] fees, String[] records) throws ParseException {

        Map<String, Integer> parkingTime = new HashMap<>(); // 키:차량번호 값: 누적시간
        Map<String, Boolean> parkingStatus = new TreeMap<>(); // 키: 차량번호 값: 주차여부 주차 했으면 true 안했으면 false
        int max=1439;

        for (String s : records) {
            String[] str = s.split(" ");
            String[] parseTime = str[0].split("\\:");

            int time = Integer.parseInt(parseTime[0]) * 60 + Integer.parseInt(parseTime[1]);


            if(str[2].equals("IN")){
                if(!parkingTime.containsKey(str[1])){
                    parkingTime.put(str[1],-time);
                    parkingStatus.put(str[1], true);
                } else {
                    parkingTime.put(str[1], parkingTime.get(str[1]) - time);
                    parkingStatus.put(str[1], true);
                }
            } else if(str[2].equals("OUT")){
                parkingTime.put(str[1],parkingTime.get(str[1])+time);
                parkingStatus.put(str[1], false);
            }
        }
        for (String s : parkingTime.keySet()) {
            System.out.println("key: " + s +" value: "+ parkingTime.get(s));
        }
        int[] answer = new int[parkingTime.size()];
        int index=0;
        for (String s : parkingStatus.keySet()) {
            if(parkingStatus.get(s)){
                int accumulatedTime = max + parkingTime.get(s);
                System.out.println(fees[0]);
                if(accumulatedTime<=fees[0]){ //기본요금 이하
                    answer[index] = fees[1]; //기본요금
                } else{
                    answer[index] = fees[1] + (int) Math.ceil((double)(accumulatedTime - fees[0]) / fees[2]) * fees[3];
                }
            } else{
                int accumulatedTime = parkingTime.get(s);
                if(accumulatedTime<=fees[0]){ //기본요금 이하
                    answer[index] = fees[1]; //기본요금
                } else{
                    answer[index] = fees[1] + (int) Math.ceil((double)(accumulatedTime - fees[0]) / fees[2]) * fees[3];

                }
            }
            index++;
        }
        return answer;
    }

    public static void main(String[] args) throws ParseException {
        ParkingFee parkingFee = new ParkingFee();
        int[] fees = {1, 461, 1, 10};
        String[] records = {"00:00 1234 IN"};
        System.out.println(Arrays.toString(parkingFee.solution(fees,records)));
    }

}
