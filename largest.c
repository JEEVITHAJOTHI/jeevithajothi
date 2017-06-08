#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,c;
    printf("enter the numbers");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b&&a>c)
        printf("%d is the largest number",a);
    if(b>a&&b>c)
        printf("%d is the greatest number",b);
    if(c>a&&c>b)
        printf( "%d is the greatest number",c);
    return 0;
}
