#include <string>
#include <vector>

using namespace std;

int L_count = 0;
int R_count = 0;
int L_location = 10;
int R_location = 12;

void calcul(int L_lo, int R_lo, int numbers){
    
    if(abs(L_lo - numbers) % 3 == 0){
        L_count += abs(L_lo - numbers) / 3;
    } else{
        if(abs(L_lo - numbers) > 9){
            L_count += 3;
        } else if(abs(L_lo - numbers) > 6){
            L_count += 2;
        } else if(abs(L_lo - numbers) > 3){
            L_count++;
        }
        L_count += abs(L_lo - numbers) % 3;
    }
    
    if(abs(R_lo - numbers) % 3 == 0){
        R_count += abs(R_lo - numbers) / 3;
    } else{
        if(abs(R_lo - numbers) > 9){
            R_count += 3;
        } else if(abs(R_lo - numbers) > 6){
            R_count += 2;
        } else if(abs(R_lo - numbers) > 3){
            R_count ++;
        }
        R_count += abs(R_lo - numbers) % 3;
    }
}

string solution(vector<int> numbers, string hand) {
    string answer = "";
    
    for(int i=0;i<numbers.size();i++){
        if(numbers[i] == 0) numbers[i] = 11;
        
        if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 ){
            answer += "L";
            L_location = numbers[i];
        } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 ){
            answer += "R";
            R_location = numbers[i];
        } else{
            calcul(L_location, R_location, numbers[i]);
            
            if(L_count > R_count){
                answer += "R";
                R_location = numbers[i];
            } else if(L_count < R_count){
                answer += "L";
                L_location = numbers[i];
            } else{
                if(hand == "right"){
                    answer += "R";
                    R_location = numbers[i];
                } else{
                    answer += "L";
                    L_location = numbers[i];
                }
            }
        }
        L_count = 0;
        R_count = 0;
    } // for
    
    return answer;
}
