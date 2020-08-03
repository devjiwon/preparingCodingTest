import java.lang.StringBuilder;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        
        //toString() : 클래스이름+@+해시코드값
        //new String() : 안의 바이트 값을 String으로 변환
        return new StringBuilder(new String(sArr)).reverse().toString();
    }
}
