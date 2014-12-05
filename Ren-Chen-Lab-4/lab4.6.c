#include <stdio.h>

int A(int x, int y)
{
    if (x == 0)
       return y+=1;
    if (y == 0)
       return A(x-1, 1);
    return A(x-1, A(x, y-1));
}
int main(void)
{
printf("Please input two non-negative integers:");
int a, b, c;
scanf("%d", &a);
scanf("%d", &b);
c = A(a,b);
printf("%d",c);

}