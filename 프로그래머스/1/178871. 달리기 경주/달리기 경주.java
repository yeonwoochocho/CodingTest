import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수 이름과 현재 순위를 매핑하는 HashMap 생성
        HashMap<String, Integer> ranking = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            ranking.put(players[i], i);
        }

        for (String call : callings) {
            // 추월하는 선수의 현재 위치
            int currentIdx = ranking.get(call);
            
            // 현재 위치가 1등이 아닌 경우에만 추월 진행
            if (currentIdx > 0) {
                // 바로 앞의 선수와 위치 교환
                String prevPlayer = players[currentIdx - 1];
                players[currentIdx - 1] = call;
                players[currentIdx] = prevPlayer;
                
                // 순위 정보 업데이트
                ranking.put(call, currentIdx - 1);
                ranking.put(prevPlayer, currentIdx);
            }
        }

        return players;
    }
}
