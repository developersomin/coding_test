package programmers.lv1;


public class PrimeNumber1 {
    public int solution(int[] nums) {
       int answer =0;
        for (int i = 0; i <= nums.length - 3; i++) {
            for (int j = i + 1; j <= nums.length - 2; j++) {
                for (int z = j +1; z <= nums.length - 1; z++) {
                    int number = nums[i] + nums[j] + nums[z];
                    boolean prime = true;
                    for (int x = 2; x < number; x++) {
                        if (number % x == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime == true) {
                        answer++;
                    }
                }
            }
        }

       return answer;
    }

    public static void main(String[] args) {
        PrimeNumber1 T = new PrimeNumber1();
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(T.solution(nums));

    }
}
