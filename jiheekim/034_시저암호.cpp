#include<iostream>
#include<string>
using namespace std;

string caesar(string s, int n)
{
    string ans = "";
    int len = s.length();
  for(int i=0;i<len;i++) {
    if(s[i]<='Z' && s[i]>='A') {
      int nc = (s[i] - 'A' + n + 26)%26;
      ans+= char(nc+'A');
    }
    else if(s[i]<='z' && s[i]>='a') {
      int nc = (s[i] - 'a' + n + 26)%26;
      ans+= char(nc+'a');
    }
    else ans+=s[i];
  }
    return ans;
}

int main()
{
    string text = "a B z";
    int testNo = 4;

    string testAnswer = caesar(text, testNo);

    cout<<testAnswer;
}
