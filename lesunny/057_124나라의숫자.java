class Solution {
    public String solution(int n) {
        String answer = "";

        int[] answerArr;
        int idx=0, sum=0, length=0;
        while(true){
            sum+= (int) Math.pow(3,idx);
            if(sum <= n && n < sum+(int)Math.pow(3, idx+1)){
                answerArr = new int[idx+1];
                length =idx+1;
                break;
            }else{
                idx++;
            }
        }
        
        //3진법 사용
        for(int i=length-1; i>-1; i--){
            if(n%3==0){
                answerArr[i] = 4;
                n--;
            }
            else if(n%3==1)
                answerArr[i] = 1;
            else if(n%3==2)
                answerArr[i] = 2;
            n/=3;
        }
        
        for(int i=0; i<length ;i++){
            answer+=answerArr[i];
        }
        
        return answer;
    }
}