#include <stdio.h>
#include <string.h>

int main()
{
    char input[100];
    scanf("%s", input);
char firstletter = input[0];
char lastletter = input[strlen(input)-1];
if(tolower(firstletter)==tolower(lastletter)){
    printf("yes");
}
else{
    printf("no");
}
    return 0;
}
