import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
        
        //String 변환
        for(int i=0; i<num.length;i++){
            num[i] = String.valueOf(numbers[i]); 
        }
        
        //배열 정렬, 정렬 규칙으로는 2개를 더해 더 큰 쪽이 우선순위가 높도록 함(내림차순)
        Arrays.sort(num,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //return -1 : s2
                //return 0 : 변화 없음
                //return 1 : s1
                // A.compareTo(B) : A>B 1, A==B 0, A<B -1
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        //0000처럼 0으로만 구성되어 있으면 0리턴
        if(num[0].equals("0"))
            return "0";
        else{
            for(int j=0;j<num.length;j++){
                answer += num[j];
            }
        }
        
        return answer;
    }
}
