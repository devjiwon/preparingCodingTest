import java.lang.Math;
import java.util.*;


class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] students = new int[3];
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        ArrayList<Integer> answerlist = new ArrayList<>();
        
        int num = answers.length;

        //답 개수
        for(int i=0; i<num; i++){
            if(answers[i]==s1[i%5])
                students[0]++;
            if(answers[i]==s2[i%8])
                students[1]++;
            if(answers[i]==s3[i%10])
                students[2]++;            
        }
        
        //최댓값 구하기
        int maxNum = Math.max(students[0],Math.max(students[1], students[2]));
        
        if(maxNum == students[0])
            answerlist.add(1);
        
        if(maxNum == students[1])
            answerlist.add(2);
        
        if(maxNum == students[2])
            answerlist.add(3);
        
        //답
        answer = new int[answerlist.size()];
        for(int i=0; i<answerlist.size(); i++){
            answer[i] = answerlist.get(i);
        }

        return answer;
    }
}
