import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 중복 제거를 위해 Set 사용
        Set<Integer> set = new HashSet<>();
        
        // 서로 다른 두 수의 합을 구합니다.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        // Set을 배열로 변환하고 오름차순 정렬합니다.
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        Arrays.sort(result);  // 오름차순 정렬
        
        return result;
    }
}
