class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] binaryArr1 = new int[n];
        int[] binaryArr2 = new int[n];
        
        for(int i=0; i<n; i++){
            //arr1 입력
            for(int j=n-1; j>=0; j--){
                if(arr1[i]>0){
                    binaryArr1[j] = arr1[i]%2;
                    arr1[i] /= 2;
                }else
                    binaryArr1[j] = 0;
            }
            
            //arr2 입력
            for(int j=n-1; j>=0; j--){
                if(arr2[i]>0){
                    binaryArr2[j] = arr2[i]%2;
                    arr2[i] /= 2;
                }else
                    binaryArr2[j] = 0;
            }
            
            StringBuffer sb = new StringBuffer();
            
            for(int k=0; k<n; k++){
                if(binaryArr1[k]==1 | binaryArr2[k]==1){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            //System.out.println(sb);
            answer[i] = sb.toString();
        }
        return answer;
    }
}
