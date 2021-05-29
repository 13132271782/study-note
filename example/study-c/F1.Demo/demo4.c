#include <stdio.h>

// 求串的长度
int strlenStr (char *str) {
    int n = 0;
    while(*str!='\0') {
        n++;
        str++;
    }
    return n;
}

void main( ) {
    char a[] = "sunday";
    int b = strlenStr(a);
    printf("length = %i", b);
}
