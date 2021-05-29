#include <stdio.h>

// 从键盘输入10个实数，计算并输出算术平均数。
void main( ) {
    int a[10];
    for (int i = 0; i < 10; i++) {
        scanf("%d", &a[i]);
    }
    int b = 0;
    for (int i = 0; i < 10; i++) {
        b += a[i];
    }
    printf("平均数 = %d", b / 10);
}