#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include<algorithm>

using namespace std;

int solution(vector<int> d, int budget) {
int sum=0;
    int temp=budget;
 sort(d.begin(), d.end());

    for (int i=0; i<d.size();i++){
       budget=budget-d[i];
       sum=sum+d[i];
  
        if(sum>temp)
                return i;
    }

}
