#include<stdio.h>
int sum_of_num(int);
int main() 
{
  int n,sum=0;
  scanf("%d",&n);
  sum=sum_of_num(n);
  printf("%d",sum);
}

int sum_of_num(int num)
{
  int sum=0;
  for(int i=1;i<=num;i++)
  {
    sum=sum+i;
  }
    return sum;
}

