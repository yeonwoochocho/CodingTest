import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=elements.length; i++){
            for(int a =0; a<elements.length; a++) {
                int sum = 0;
                for (int b=0; b<i; b++) {
                    sum += elements[(a+b)%elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}