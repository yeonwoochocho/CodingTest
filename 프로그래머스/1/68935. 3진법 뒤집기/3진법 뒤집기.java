import java.util.Stack;

class Solution {
    public int solution(int n) {
        Stack<Integer> stack=new Stack<>();
        while(n>0) {
            stack.add(n%3);
            n/=3;
        }

        int ans=0,i=0;
        while(!stack.isEmpty()) ans+=stack.pop()*Math.pow(3,i++);
        return ans;
    }
}