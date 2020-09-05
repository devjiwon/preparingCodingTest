#include <iostream>
#include <stack>

using namespace std;

int main(){
    int k;
    scanf("%d", &k);
    stack<int> st;

    for(int i=0;i<k;i++){
        string s;
        cin >> s;

        if(s == "push"){
            int a;
            scanf("%d", &a);

            st.push(a);
        } else{
            if(s == "pop"){
                if(st.empty()){
                    printf("-1\n");
                } else{
                    printf("%d\n", st.top());
                    st.pop();
                }
            } else if(s == "size"){
                printf("%d\n", st.size());
            } else if(s == "empty"){
                if(st.empty()){
                    printf("1\n");
                } else{
                    printf("0\n");
                }
            } else if(s == "top"){
                if(st.empty()){
                    printf("-1\n");
                } else{
                    printf("%d\n", st.top());
                }
                
            }
        }
    }

    return 0;
}
