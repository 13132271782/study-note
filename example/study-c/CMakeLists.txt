cmake_minimum_required(VERSION 3.16)
project(study_c C)

set(CMAKE_C_STANDARD 99)

add_executable(study_c main.c)
add_executable(index 2.basics/2.1.data-type/2.1.1.constant/index.c)
add_executable(integer 2.basics/2.1.data-type/2.1.2.variable/integer.c)
add_executable(init 2.basics/2.1.data-type/2.1.2.variable/init_defineThenAssign.c)
add_executable(init_defineAndAssign 2.basics/2.1.data-type/2.1.2.variable/init_defineAndAssign.c)

add_executable(demo1 F1.Demo/demo1.c)
add_executable(demo2 F1.Demo/demo2.c)
add_executable(demo3 F1.Demo/demo3.c)
add_executable(demo4 F1.Demo/demo4.c)
add_executable(demo5 F1.Demo/demo5.c)
add_executable(demo6 F1.Demo/demo6.c)