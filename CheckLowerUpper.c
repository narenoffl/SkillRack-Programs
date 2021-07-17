#include <stdio.h>

int main()
{
    char input[100];
    fgets(input,100,stdin);
char first = input[0];
if(isupper(first))
{
    printf("uppercase");
}
else{
    printf("lowercase");
}
    return 0;
}
