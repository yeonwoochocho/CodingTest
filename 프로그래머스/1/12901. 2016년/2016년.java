import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3).toUpperCase();
    }
}
//LocalDate를 사용해서 getDayOfWeek로 요일을 불러오고 문자열 변환(toString) 후 어차피 요일의 앞 3자만 가져오면 되기 때문에 앞 3자만 잘라서(substring) 대문자화(toUpperCase) 시켰다.