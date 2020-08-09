class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] flags = new int[n+1]; //0~n
        
        //초기화
        for(int i=1; i<=n; i++)
            flags[i] = 1;
        
        //lost와 reseve가 같을 때
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    flags[lost[i]] = -2;
                    answer++;
                    break;
                }                    
            }
        }
        
        //빼기
        for(int i=0; i<lost.length; i++)
            flags[lost[i]] -= 1;
        
        //나눠주기
        for(int i=0; i<reserve.length; i++){    
            flags[reserve[i]] += 1;
            
            if(flags[reserve[i]]>1 && reserve[i]-1>0 && flags[reserve[i]-1] == 0){
                flags[reserve[i]-1] += 1;
                flags[reserve[i]] -= 1;
            }else if(flags[reserve[i]]>1 && reserve[i]+1<n+1 && flags[reserve[i]+1] == 0){
                flags[reserve[i]+1] += 1;
                flags[reserve[i]] -= 1;
            }
        }
        
        
        
        for(int i=1; i<n+1; i++){
            System.out.print(flags[i]+" ");
            if(flags[i]>0)
                answer++;
        }    
        
        
        
        return answer;
    }
}
