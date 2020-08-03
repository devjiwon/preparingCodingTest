int solution(int num){
    int result=0;
    for(int i=2; i<=num;i++){
        boolean isPrime=true;
        for(int j=2;j*j<=i; j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            result++;
    }
    return result;
}
