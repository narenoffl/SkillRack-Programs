// Reverse the given string and change to uppercase

#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char inputstr[100];
    scanf("%s", inputstr);

    int startindex=0;
    int endindex=strlen(inputstr)-1;
    char temp;

    while(startindex < endindex)
    {
temp=inputstr[startindex];
inputstr[startindex] = toupper(inputstr[endindex]);
inputstr[endindex] = toupper(temp);

startindex++;
endindex--;

if(startindex == endindex)
{
    inputstr[startindex] = toupper(inputstr[startindex]);
}
    }//end of while loop

    printf("%s", inputstr);

    return 0;
}
