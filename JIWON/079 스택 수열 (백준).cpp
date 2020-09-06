#include <iostream>
#include <queue>
#include <stack>

using namespace std;

int main(){
    queue<int> st; 
    queue<char> answer; // +, - 값 저장하는 queue
    int n;

    stack<int> temp;
    int q = 1;

    scanf("%d", &n);

    for(int i=0;i<n;i++){
        int a;
        scanf("%d", &a);
        st.push(a);
    }
    
    while(q<=n){
        if(st.empty()) {
            printf("NO\n");
            return 0;
        }

        if(st.front() == q){
            answer.push('+');
            answer.push('-');
            st.pop();
            q++;
        } else if(q > st.front()){
            if(temp.top() == st.front()){
                answer.push('-');
                st.pop();
                temp.pop();
            }
            else{
                printf("NO\n");
                return 0;
                break;
            }
        } else if(q < st.front()){
            answer.push('+');
            temp.push(q);
            q++;
        }
    }

    while(!st.empty()){
        if(st.front() == temp.top()){
            answer.push('-');
            temp.pop();
            st.pop();
        } else{
            printf("NO\n");
            return 0;
        }
    }

    while(!answer.empty()){
        // cout << answer.front() << endl;
        printf("%c\n", answer.front());
        answer.pop();
    }

    return 0;
}
