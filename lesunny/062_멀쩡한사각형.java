class Solution {
    int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public long solution(int w, int h) {
        long answer = 1;
        int gcd = 0;
        if(w>=h)
            gcd = gcd(w,h);
        else
            gcd = gcd(h,w);        
        
        answer = (long)w*h -w - h +gcd;
        
        return answer;
    }
}
