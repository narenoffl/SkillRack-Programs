// Print length of the string without library methods

#include <stdio.h>
#include <string.h>

int main()
{
    char first[100],second[100];
    fgets(first,100,stdin);
    fgets(second,100,stdin);

    int firstStringLength=0, secondStringLength=0;
while(first[firstStringLength] != '\0')
{
    firstStringLength++;
}

while(second[secondStringLength] != '\0'){
    secondStringLength++;
}

if(firstStringLength<secondStringLength)
{
    printf("%s",first);
}
else{
    printf("%s",second);
}
    return 0;
}
