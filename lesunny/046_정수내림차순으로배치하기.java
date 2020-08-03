import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> nlist = new ArrayList<>();
        
        while(n!=0){
            nlist.add(n%10);
            n/=10;
        }
        
        Collections.sort(nlist);//오름차순
        Collections.reverse(nlist);//뒤집기
        
        for(long element : nlist){
            answer = answer*10 + element;
        }
        
        return answer;
    }
}
