class Solution {
   boolean solution(String s) {
		int total = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equalsIgnoreCase("p")) total++;
			else if(s.substring(i, i+1).equalsIgnoreCase("y")) total--;
		}
		
		return total == 0 ? true : false;
	}
}
