#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    int flag=0;
    for(int curr_row = 1; curr_row <= n; curr_row++){
        for(int curr_col = 1; curr_col <= curr_row; curr_col++){
            if(flag == 0)
            {
                printf("*");
                flag = 1;
            }
            else{
                printf("#");
                flag = 0;
            }
        }
        printf("\n");
    
    }
    return 0;
}