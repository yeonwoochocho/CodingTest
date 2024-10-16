import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int arr : array) {
            nums.add(arr);
        }
        for(int i=0; i<commands.length; i++){
            List<Integer> sub = nums.subList(commands[i][0]-1, commands[i][1]);
            List<Integer> subNum = new ArrayList<>(sub);
            Collections.sort(subNum);
            answer[i] = subNum.get(commands[i][2]-1);
                
        }
        return answer;
    }
}