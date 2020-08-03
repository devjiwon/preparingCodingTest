class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("p") || s.substring(i,i+1).equals("P"))
                p_cnt++;
            else if(s.substring(i,i+1).equals("y") || s.substring(i,i+1).equals("Y"))
                y_cnt++;
        }
        
        if(p_cnt != y_cnt) answer = false;

        return answer;
    }
}
