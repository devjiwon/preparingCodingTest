class Solution {
    public String calculateDistance(int lh, int rh, int number, String hand){
        
        int dl = 0;
        int dr = 0;
        
        dl = Math.abs(number-lh)%3 + Math.abs(number-lh)/3;
        dr = Math.abs(number-rh)%3 + Math.abs(number-rh)/3;
        
        //System.out.println(dl+" "+dr);
        
        if(dl < dr)
            return "L";
        else if(dr < dl)
            return "R";
        else{
            if(hand.equals("left"))
                return "L";
            else
                return "R";
        }
        
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lh = 10;
        int rh = 12;
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==0)
                numbers[i] = 11;
            
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer+= "L";
                lh = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 ){
                answer+= "R";
                rh = numbers[i];
            }else{
                if(calculateDistance(lh, rh, numbers[i], hand).equals("L")){
                    answer+="L";
                    lh = numbers[i];
                }else{
                    answer+="R";
                    rh = numbers[i];
                }
            }
                
        }
        
        return answer;
    }
}
