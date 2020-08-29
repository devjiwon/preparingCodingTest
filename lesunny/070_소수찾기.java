import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> ans = new ArrayList<>();
    static void checkPrime(int n){
    	if(n<2)
    		return;
        boolean prime = true;
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime&& !ans.contains(n)){
            //System.out.println(n);
            ans.add(n);
        }
    }
    
    static void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    
    static void permutation (int[] nums, int start, int end){
        int range = end - start;
        
        if(range == 1){
            String n = "";
            for(int num : nums){
                n+=num;
            }
            checkPrime(Integer.parseInt(n));
        }else{
            for(int i=0; i<range; i++){
                swap(nums, start, start+i);
                permutation(nums, start+1, end);
                swap(nums, start, start+i);
            }
        }
    }
    public static int solution(String numbers){
        int answer = 0;
        int length = numbers.length();
        
        int[] flags=new int[length];
        int idx_max =(int)Math.pow(2,length);
        for(int i=1; i<idx_max; i++){
            int arrN = 0;
            int tmp = i;
            for(int j=length-1; j>=0;j--){
            	flags[j] = tmp%2;
                if(flags[j]!=0)
                    arrN++;
                tmp/=2;
            }

            int[] nums = new int[arrN];
            int idx=0;
            for(int j=0; j<length; j++){
                if(flags[j]!=0){
                    nums[idx]=Integer.parseInt(numbers.substring(j,j+1));
                    idx++;
                }
            }
            permutation(nums, 0, arrN);
        }
        answer = ans.size();
        return answer;
    }
}
