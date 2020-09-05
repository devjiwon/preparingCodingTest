#include <iostream>
#include <stack>

using namespace std;

int main(){
    int n;
    scanf("%d", &n);

    for(int i=0;i<n;i++){
        string s;
        cin >> s;
        int num = 0;

        stack<char> st;

        for(int i=0;i<s.size();i++){
            st.push(s[i]);
        }

        while(!st.empty()){
            if(st.top() == '('){
                num++;
            } else{
                num--;
            }
            st.pop();

            if(num > 0){
                break;
            }
        }

        if(num == 0){
            printf("YES\n");
        } else{
            printf("NO\n");
        }

    }

    return 0;
}
