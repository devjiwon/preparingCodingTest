#include <vector>

using namespace std;

int allsum(int location, int m, int n, int x, int y, vector<vector<int>> &picture){

	int sum = 1;

	if (x >= m || y >= n || x<0 || y<0 || picture[x][y] != location)
		return 0;

	else {
		picture[x][y] = 0;//들렸으니 0 처리
        
        sum += allsum(location, m, n, x + 1, y, picture); // 오른
		sum += allsum(location, m, n, x, y + 1, picture); // 위
		sum += allsum(location, m, n, x - 1, y, picture); // 왼
		sum += allsum(location, m, n, x, y - 1, picture); // 아래
	}

	return sum;
}

vector<int> solution(int m, int n, vector<vector<int>> picture) {

	int number_of_area = 0;
	int max_size_of_one_area = 0;
	int sum = 0;

	vector<int> answer(2);

	for (int i = 0; i<m; i++){
		for (int j = 0; j<n; j++){

			if (!picture[i][j]) continue;

			else{
				sum = allsum(picture[i][j], m, n, i, j, picture);
				number_of_area++;

				if (sum > max_size_of_one_area) max_size_of_one_area = sum;
            		}
		}
	}

	answer[0] = number_of_area;
	answer[1] = max_size_of_one_area;

	return answer;
}
