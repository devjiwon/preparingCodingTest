#include <stdio.h>

int n;
int numbers[11];
int oper[4];

int min = 1000000005;
int max = -1000000005;
int index = 0;

void func(int index, int number, int add, int sub, int mul, int div){
    if(index >= n){
        if(number > max) max = number;
        if(number < min) min = number;

        return;
    }

    if(add != 0) func(index+1, number + numbers[index], add - 1, sub, mul, div);
    if(sub != 0) func(index+1, number - numbers[index], add, sub - 1, mul, div);
    if(mul != 0) func(index+1, number * numbers[index], add, sub, mul - 1, div);
    if(div != 0) func(index+1, number / numbers[index], add, sub, mul, div - 1);
}

int main(){
    scanf("%d", &n);

    for(int i=0;i<n;i++){
        scanf("%d", &numbers[i]);
    }

    for(int i=0;i<4;i++){
        scanf("%d", &oper[i]);
    }

    func(1, numbers[0], oper[0], oper[1], oper[2], oper[3]);

    printf("%d\n%d", max, min);
    
    return 0;
}
