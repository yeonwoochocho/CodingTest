import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++){
            char first = survey[i].charAt(0), second = survey[i].charAt(1);

            if (4 <= choices[i]){
                map.put(second, map.getOrDefault(second, 0) + choices[i] - 4); //choices[i] 값이 4 이상일 경우 second 유형에 점수를 더합니다.
            } else {
                map.put(first, map.getOrDefault(first, 0) + 4 - choices[i]); //4보다 작으면 first 유형에 점수를 더해줍니다.
            }

        }
//"RT", "CF", "JM", "AN"을 기준으로 각 성격 유형 쌍의 점수를 비교해 더 높은 점수를 가진 유형을 선택하고, 점수가 같을 경우 사전순으로 앞에 오는 유형을 선택해 answer에 추가합니다.
        String[] arr = {"RT", "CF", "JM", "AN"}; 

        for (String str : arr) {
            char first = str.charAt(0), second = str.charAt(1); 

            if (map.getOrDefault(first, 0) > map.getOrDefault(second, 0) || 
                map.getOrDefault(first, 0) == map.getOrDefault(second, 0)){
                answer += first;
            } else {
                answer += second;
            }
        }
        return answer;
    }
}