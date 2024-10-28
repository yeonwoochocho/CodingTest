class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //0이 몇개나 있는지 확인해야함
        //숫자 당첨 갯수 -> 최저순위
        //숫자 당첨 개수 + 0개 개수 -> 최고 순위
        
        int zeroCnt = 0;
        int winCnt = 0;
        for(int lottoNum : lottos){
            if(lottoNum==0){
                zeroCnt += 1;
                continue;
            }
            for(int winNum : win_nums){
                if(lottoNum == winNum){
                    winCnt += 1;
                    break;
                }
            }
        }
        

        int[] answer = new int[2];
        answer[0] = getRank(winCnt+zeroCnt);//최고순위
        answer[1] = getRank(winCnt);//최저순위
        return answer;
    }
    
    public int getRank(int win){
       return switch(win){
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
            
    }
}
