#include <stdio.h>
#include <ctype.h>

int main()
{
    char strvalue[100];
    char letterToFind;

    //Read input values.
    scanf("%s\n%c", strvalue, &letterToFind);
    
    int occurrenceCount=0;
    int index=0;
    while(strvalue[index] != '\0')
    {
if(tolower(letterToFind) == tolower(strvalue[index])){
    occurrenceCount++;
}
        index++;
    }//end of while loop

    printf("%d",occurrenceCount);
    return 0;
}
