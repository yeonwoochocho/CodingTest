import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        Map<Character, Integer> lastSeen = new HashMap<>();  // 각 문자의 마지막 위치 저장

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (lastSeen.containsKey(currentChar)) {
                // 이전에 같은 문자가 있었으면, 그 위치와의 거리 저장
                result[i] = i - lastSeen.get(currentChar);
            } else {
                // 같은 문자가 없으면 -1 저장
                result[i] = -1;
            }

            // 현재 문자의 위치를 업데이트
            lastSeen.put(currentChar, i);
        }

        return result;
    }
}
