#include <algorithm>

using namespace std;

long long solution(int w,int h) {
    long long answer = 1;
    long long gcd = 0;
    long long sum = (long long)w*h;
    
    if(w > h) swap(w, h);
    
    for(int i = w; i > 0; i--){
        if(w % i == 0 && h % i == 0){
            gcd = i;
            break;
        }
    }
    
    answer = sum - gcd*((w/gcd) + (h/gcd) - 1);
  
    return answer;
}
