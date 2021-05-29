#include <stdio.h>

// 串的复制
char * strcpy (char *s1 , char *s2) {
    char *p=s1;
    while( *s2!='\0') {
        *p= * s2;
        s2++; p++;
    }
    *p='\0' ;
    return s1;
}

void main( ) {
    char a1[8];
    char a2[ ] = "student";
    strcpy( a1,a2);
    printf("a1 = %s; a2 = %s;\n", a1, a2);
    char a3[7];
    char a4[ ] = "sunday";
    strcpy( a3,a4);
    printf("a3 = %s; a4 = %s;\n", a3, a4);
}
