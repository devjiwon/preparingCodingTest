class Solution {
    public int solution(String s) {
        int answer = 1000;
        int s_len = s.length();
        int grouping_len = s.length()/2;
        if(s_len==1){
            return 1;
        }
        
        for(int i=1; i<=grouping_len ; i++){
            String compStr1 = "";
            String resultStr = "";
            int cnt = 1;
            
            for(int j=0; j<s_len/i; j++){
                String compStr2 = s.substring((i*j), (i*j)+i);
                if(compStr1.equals(compStr2)){
                    cnt++;
                    continue;
                }
                if(cnt>1){
                    resultStr += cnt+compStr1;
                }else{
                    resultStr += compStr1;
                }
                compStr1 = compStr2;
                cnt = 1;
            }
            if(cnt>1){
                resultStr += cnt+compStr1;
            }else{
                resultStr += compStr1;
            }
            //System.out.println(resultStr);
            if(s_len % i != 0){
                resultStr+= s.substring(s_len - (s_len%i), s_len);
            }
            answer = Math.min(resultStr.length(), answer);
        }
        
        return answer;
    }
}
