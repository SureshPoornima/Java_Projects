#include <stdio.h>
#include <stdlib.h>
int addNum(int n);
int main()
{
    int num;
  	scanf("%d", &num);
    printf("%d",addNum(num));
    return 0;
}
int addNum(int n)
{
    if(n != 0)
        return n + addNum(n-1);
    else
        return n;
}