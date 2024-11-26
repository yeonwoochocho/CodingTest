class Solution {
    public long solution(int n) {
        long result = 1; // 결과를 저장할 변수, 초기값은 1
        
        long n1 = 1; // 피보나치 수열에서 첫 번째 값
        long n2 = 1; // 피보나치 수열에서 두 번째 값
        
        // n번째 피보나치 수를 구하기 위한 반복문
        for (int i = 1; i < n; i++) {
            // 이전 두 값의 합을 1234567로 나눈 나머지를 결과로 저장
            result = (n1 + n2) % 1234567;
            n1 = n2; // 두 번째 값을 첫 번째 값으로 갱신
            n2 = result; // 결과 값을 두 번째 값으로 갱신
        }
        
        return result; // 최종 결과 반환
    }
}
