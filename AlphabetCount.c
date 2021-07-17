#include <stdio.h>
#include <string.h>

int main()
{
    char inputstr[100];
    fgets(inputstr,100,stdin);

    int alphabetCount=0;

    int index=0;
    while(index < strlen(inputstr))
    {
if(isalpha(inputstr[index])){
    alphabetCount++;
}
index++;
    }//end of while loop

    printf("%d",alphabetCount);

    return 0;
}
