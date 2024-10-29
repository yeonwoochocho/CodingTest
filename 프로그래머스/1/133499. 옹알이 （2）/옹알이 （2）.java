import java.util.HashMap;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("aya", 0);
        map.put("ye", 0);
        map.put("woo", 0);
        map.put("ma", 0);

        for (int i = 0; i < babbling.length; i++){
            String attached_str = ""; //현재 조합중인 단어
            String before_str = ""; //이전에 완성된 단어

            for (int j = 0; j < babbling[i].length(); j++){
                attached_str += babbling[i].charAt(j); //한글자씩 추가

                if (map.containsKey(attached_str) && !before_str.equals(attached_str)){
                    before_str = attached_str; //이전 단어 갱신
                    attached_str = ""; //현재 단어 초기화
                }
            }

            if (attached_str.isEmpty()) answer += 1;
        }



        return answer;

    }
}