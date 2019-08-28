#include<stdio.h>
int square_of_num(int);
int main() {
  int n,square;
  scanf("%d",&n);
  square=square_of_num(n);
  printf("%d",square);
}

  int square_of_num(int num)
  {
    int square_of_num;
    square_of_num=num*num;
    return square_of_num;
}
   // Type your code here
 
