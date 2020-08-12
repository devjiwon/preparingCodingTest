import java.util.LinkedList;

class DocNode{
    int idx;
    int priority;
    public DocNode(int idx, int priority){
        this.idx = idx;
        this.priority = priority;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        LinkedList<DocNode> documents = new LinkedList<>();
        
        for(int i=0; i<priorities.length ; i++){
            documents.add(new DocNode(i, priorities[i]));
        }
        
        while(documents.size()>1){
            DocNode firstDoc = documents.getFirst();
            
            for(int i=1; i<documents.size(); i++){
                if(firstDoc.priority < documents.get(i).priority){
                    documents.addLast(firstDoc);
                    documents.removeFirst();
                    break;
                }
                
                //print
                if(i==documents.size()-1){
                    if(firstDoc.idx==location)
                        return answer;
                    else{
                        documents.removeFirst();
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
