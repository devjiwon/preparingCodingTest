#include <iostream>
#include <stack>

using namespace std;

int main(){
    stack<int> s;
    int k;

    scanf("%d", &k);

    for(int i=0;i<k;i++){
        int a;
        scanf("%d", &a);

        if(a != 0){
            s.push(a);
        } else{
            s.pop();
        }
    }

    int answer = 0;

    while(!s.empty()){
        answer += s.top();
        s.pop();
    }

    printf("%d", answer);

    return 0;
}
