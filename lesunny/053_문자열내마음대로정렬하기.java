import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> alStrings = new ArrayList<>();
        
        //input
        for(int i=0; i<strings.length; i++){
            alStrings.add(strings[i].substring(n,n+1) + strings[i]);
        }
        System.out.println(alStrings);
        
        //ascending order
        Collections.sort(alStrings);
        
        int idx = 0;
        for(String string : alStrings){
            answer[idx++] = string.substring(1, string.length());
        }
        
        return answer;
    }
}
