#include <stdio.h>

// 串的连接
char * strcat (char *s1 , char *s2) {
    char *p = s1;
    while(*p != '\0')
        p++;
    while(*s2 != '\0'){
        *p = *s2;
        p++;
        s2++;
    }
    *p = '\0';
    return s1;
}

void main( ) {
    char a2[ ] = "student";
    char a3[ ] = "sunday";
    printf("a2 + a3 = %s;\n", strcat(a2, a3));
}
