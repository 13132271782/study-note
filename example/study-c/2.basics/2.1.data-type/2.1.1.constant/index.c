#include <stdio.h>

// 用#define命令定义PI为符号常量，代表3.1415926
#define PI 3.1415926
// 用#define命令定义 R为符号常量，代表10
#define R 10

void main() {
    float cir, area ;
    cir = 2*PI* R ;
    area= PI * R * R;
    printf("cir=%f, area=%f\n", cir,area);
}
