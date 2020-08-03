class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char temp = ' ';
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if((char)65 <= c && c <= (char)90){//대문자
                temp = (char)((int)c + n);
                if(temp > 90) temp -= 26;
            }
            
            else if((char)97 <= c && c <= (char)122){//소문자
                temp = (char)((int)c + n);
                if(temp >122) temp -= 26;
            }
            
            answer += Character.toString(temp);
            temp=' ';
        }
        
        return answer;
    }
}
