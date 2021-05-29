#include <stdio.h>

// 从键盘输入3个整数输出其中最大数
void main( ) {
    printf("请输入三个数字\n");
    int a, b, c;
    scanf("%d%d%d", &a, &b, &c);
    printf("您输入的三个数字为 %i,%i,%i\n", a, b, c);
    if (a > b && a > c) {
        printf("最大数 = %i\n", a);
    } else if (b > a && b > c) {
        printf("最大数 = %i\n", b);
    } else {
        printf("最大数 = %i\n", c);
    }
}