import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 결과를 저장할 변수
        int result = 0;
        
        // 귤의 크기와 해당 크기의 개수를 저장할 HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 귤의 크기별로 개수를 세어 HashMap에 저장
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        // HashMap의 키(귤의 크기) 리스트 생성
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        // 귤의 개수를 기준으로 내림차순 정렬
        keySet.sort((size1, size2) -> map.get(size2) - map.get(size1));
        
        // 많은 개수의 귤 크기부터 순서대로 k에서 뺌
        for (Integer size : keySet) {
            k -= map.get(size);
            result++;
            // k가 0 이하가 되면 종료
            if (k <= 0) {
                break;
            }
        }
        
        // 최소 종류의 귤 개수를 반환
        return result;
    }
}
