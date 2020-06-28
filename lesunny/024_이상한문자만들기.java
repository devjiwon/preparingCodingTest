import java.lang.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ",-1); //https://elmkm.tistory.com/20
        
        for(int i=0;i<arr.length; i++){
            arr[i].trim();
            for(int j=0; j<arr[i].length();j++){
                if(j%2==0)
                    answer += Character.toString(Character.toUpperCase(arr[i].charAt(j)));
                else
                    answer += Character.toString(Character.toLowerCase(arr[i].charAt(j)));
            }
            answer+=" ";
        }
        
        return answer.substring(0, answer.length()-1);//answer.length()-1);
    }
}
