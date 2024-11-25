class Solution {
    public int solution(int[] arr) {
        int answer = lcm(arr[0], arr[1]);
        
        for(int i = 2; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    // 최대 공약수
    public int gcd(int a, int b){
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    // 최소 공배수
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
}