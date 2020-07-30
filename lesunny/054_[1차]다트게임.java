class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] games = new int[3];
        int idx = 0;
        
        for(int i=0; i<3 ; i++){
            while(Character.isDigit(dartResult.charAt(idx))){
                System.out.print(dartResult.charAt(idx)+" ");
                games[i]*=10;
                games[i]+=Integer.parseInt(dartResult.substring(idx,idx+1));

                idx++;
            }
            
            try{
                if(dartResult.substring(idx,idx+1).equals("S")){
                    games[i] = (int)Math.pow(games[i],1);
                }else if(dartResult.substring(idx,idx+1).equals("D")){
                    games[i] = (int)Math.pow(games[i],2);
                }else if(dartResult.substring(idx,idx+1).equals("T")){
                    games[i] = (int)Math.pow(games[i],3);
                }
                idx++;
            }catch(StringIndexOutOfBoundsException e){
            }
            
            try{
                if(dartResult.substring(idx,idx+1).equals("#")){
                    games[i] *= -1;
                }else if(dartResult.substring(idx,idx+1).equals("*")){
                    games[i] *= 2;
                    if(i!=0)
                        games[i-1]*=2;
                }else if(idx < dartResult.length() && Character.isDigit(dartResult.charAt(idx))){
                    continue;
                }else{
                    continue;

                }
                idx++;
            }catch(StringIndexOutOfBoundsException e){
            }
        }

        for(int i=0; i<3; i++){
            answer += games[i];
        }
        
        return answer;
    }
}
