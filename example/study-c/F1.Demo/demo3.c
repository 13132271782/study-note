#include <stdio.h>
#include <math.h>

// 利用穷举法编写一个算法判断给定的正整数n是否是素数，即判断n是否只能被1和自身整除。
int main( ) {
    int m, i, k;
    scanf("%d", &m);
    k = sqrt(m);
    for (i = 0; i <= k; i++) {
        if (m % 2 == 0) {
            break;
        }
    }
    if (i > k + 1) {
        printf("%d 是一个素数\n", m);
    } else {
        printf("%d 不是一个素数\n", m);
    }
    return 0;
}