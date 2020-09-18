#include <queue>
#include <iostream>

using namespace std;

int n, k; // n는 수빈, k는 동생

int trace[100001];

queue<int> q;

int bfs() {
	q.push(n);
	trace[n] = 1;

	while (!q.empty()) {
		int p = q.front();
		q.pop();
		if (p == k) return trace[p] -1;

		if (p - 1 >= 0 && trace[p - 1] == 0) {
			q.push(p - 1);
			trace[p - 1] = trace[p] + 1;
		}
		if (p + 1 <= 100000 && trace[p + 1] == 0) {
			q.push(p + 1);
			trace[p + 1] = trace[p] + 1;
		}
		if (p * 2 <= 100000 && trace[2*p] == 0) {
			q.push(p * 2);
			trace[p * 2] = trace[p] + 1;
		}
	}

    return 0;
}

int main(void) {
	scanf("%d %d", &n, &k);
	
	printf("%d\n", bfs());

	return 0;
}
