class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
      int sum = 0;
      
      for(int i=1; i<a;i++){
          if(i<8){
              if(i==2) 
                  sum += 29;
              else if(i%2==0)
                  sum += 30;
              else
                  sum+= 31;
          }else {
              if(i%2==0)
                  sum+=31;
              else
                  sum+=30;
          }
      }
      sum+=b;
      
      answer=days[sum%7];
      
      return answer;
  }
}
