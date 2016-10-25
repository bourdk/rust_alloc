cmake_minimum_required(VERSION 3.2.2) # CMake version check
project(school2016)               # Create project "simple_example"
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall -Werror")

set(SOURCE_FILES c/matrix_alloc_test.c)            # Add matrix_alloc_test.c file of project root directory as source file
add_executable(school2016 ${SOURCE_FILES})       # Add executable target with source files listed in SOURCE_FILES variable