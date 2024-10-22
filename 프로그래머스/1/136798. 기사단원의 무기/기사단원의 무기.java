import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] num = new int[number];
        for(int i = 0; i < number; i++) {
            for(int j = 1; j <= (int) Math.sqrt(i + 1); j++) {
                if((i + 1) % j == 0) {
                    num[i]++;
                    if((i + 1) / j != j) num[i]++;
                }
            }
        }
        for(int n : num) {
            if(n > limit) answer += power;
            else answer += n;
        }
        return answer;
    }
}