import java.util.*;

class Solution {    
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> ansMap = new HashMap();
        
        //실패율 구하기
        for(int i=0; i<N; i++){
            int clearyet = 0;
            int reach = 0;
            
            for(int j=0; j<stages.length; j++){
                if(stages[j] > i+1)
                    reach++;
                else if(stages[j] == i+1){
                    reach++;
                    clearyet++;
                }
            }
            if(reach == 0)
                ansMap.put(i+1, 0.);
            else{
                ansMap.put(i+1, (double)clearyet/(double)reach);
                //System.out.println(ansMap.get(i+1));
            }
        }        

        //sort in descending order by values
        LinkedHashMap<Integer, Double> reverseSortedMap = new LinkedHashMap<>();
        ansMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
        .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        
        int idx=0;
        for(Integer stage : reverseSortedMap.keySet()){
            answer[idx++] = stage;
        }
                
        return answer;
    }
}
