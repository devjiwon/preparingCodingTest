class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int[] rank = new int[26];
        
        for(int i=0; i<skill.length(); i++){
            int idx = skill.charAt(i)-'A';
            rank[idx] = i+1;
        }
        
        for(int i=0; i<skill_trees.length; i++){
            int pos = 1;
            boolean flag = true;
            for(int j=0; j<skill_trees[i].length(); j++){
                if(rank[skill_trees[i].charAt(j)-'A']==0){
                    continue;
                }else if(rank[skill_trees[i].charAt(j)-'A']==pos){
                    pos++;
                    continue;
                }else{
                    flag = false;
                }
            }
            if(flag==true)
                answer++;
        }
        
        return answer;
    }
}
