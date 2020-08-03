class Solution {
    /*
    에라토스테네스의 체 사용(https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4)
    */
    public int solution(int n) {
        int answer = 0;
        
        boolean[] primes = new boolean[n+1];
        //2~n
        for(int i=2;i<=n; i++)
            primes[i] = true;
        
        // 2 ~ i*i <= n
        // 각 배수 제거
        for(int i=2; (i*i)<=n; i++){
            if(primes[i]){
                for(int j=i*i; j<=n; j+=i){
                    primes[j] = false;
                    //i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화
                }
            }
        }
        
        for(int i=0; i<=n ; i++){
            if(primes[i])
                answer++;
        }
        
        
        return answer;
    }
}
