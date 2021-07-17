#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char stringvalue[100];
    scanf("%s", stringvalue);

    int index=0, consonantCount = 0;
    char current_letter;
while(stringvalue[index] != '\0'){
    current_letter = tolower(stringvalue[index]);
    if(current_letter != 'a' && current_letter != 'e' && current_letter != 'i' && current_letter != 'o' && current_letter != 'u')
    {
        consonantCount++;
    }
    index++;
}
    printf("%d",consonantCount);

    return 0;
}
