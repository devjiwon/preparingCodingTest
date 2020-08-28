class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int all = yellow+brown;
        
        for(int i=3; i<=(int)Math.sqrt(all); i++){ //세로
            if(all%i!=0)
                continue;
            else{
                int j=all/i; //가로
                if(yellow==(i-2)*(j-2) && brown==all-yellow){
                    answer[0]=j;
                    answer[1]=i;
                }
            }
        }
        
        return answer;
    }
}
