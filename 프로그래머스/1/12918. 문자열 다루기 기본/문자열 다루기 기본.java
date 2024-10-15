class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6 ){
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;  // 숫자가 아닌 문자가 포함되어 있으면 false 반환
            }
        }

        return true;  // 길이와 숫자 조건 모두 만족하면 true 반환
    }
}