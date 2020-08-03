#include <string>
#include <vector>
#include<iostream>

using namespace std;

int main() {
	vector<string> v;
	int n;
	cin >>n;
	for (int i = 0; i < n; i++) {
		v.push_back("수");
		v.push_back("박");
	}

	for (int i = 0; i < n; i++) {

		cout << v[i];
	}
	system("pause");
}
