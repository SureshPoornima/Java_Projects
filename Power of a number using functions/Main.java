#include<stdio.h>
int power_of_a_no(int base, int exponent);
int main(){
    int base, exponent;
    scanf("%d%d", &base, &exponent);
    printf("%d", power_of_a_no(base, exponent));// Function call
  	return 0;
}
int power_of_a_no(int base, int exponent)
{
    int power = 1;
    while(exponent >= 1)
    {
        power = power * base;
        exponent--;
    }
      return power;
} 