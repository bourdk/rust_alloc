#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "headers/intmodp.h"

int myrand(int);
void initRow(int*, size_t);

int main(){
    int n, m, c;
	int** mtx;  // this is an arbitrarily sized 2D matrix
	
	srand((unsigned int)time(NULL));
 
    printf("Enter the number of rows and columns to allocate\n");
    scanf("%d%d", &n, &m);

	if( ( mtx = malloc(n * sizeof(int*))) == NULL ){
		printf("Had a bad time allocating %d int ptrs", n);
		return -1;
	}
	
    for (c = 0; c < n; c++){
        if( ( mtx[c] = malloc(m * sizeof(int)) ) == NULL ){
			printf("Had a bad time allocating %d ints", m);
			return -1;
		}
		initRow(mtx[c], m);
	}
	printMtx(mtx, n, m);

	free(mtx);
	
	// run some simple tests on Z mod 7
	int_modp r1 = { .i=1, .p=7 }, r2 = { .i=3, .p=7 };
	printf("sizeof: %d; mul values: %d %d\n", sizeof(mul(r1, r2)), mul(r1, r2).i, mul(r2, r1).i);
	
	
	// run some simple tests on Z mod 7 with bit fields
	int_modp_word v1 = { .i=1, .p=7 };
	printf("sizeof: %d; value: %d", sizeof(v1), v1.i);
 
    return 0;
}

int_modp mul(int_modp a, int_modp b){
	int_modp result = { .i = 0, .p = 0};
	if(a.p != b.p){
		return result;
	}
	result.i = (a.i * b.i) % a.p;
	result.p = a.p;
	
	return result;
}

void printMtx(int** mtx, size_t n, size_t m){
	int i, j;
	for (i = 0; i < n; i++) {
		printf("%d: ", i);
        for (j = 0; j < m; j++) {
            printf("%3d  ", mtx[i][j]);
        }
        printf("\n");
    }
}

void initRow(int* array, size_t size){
	int i;
	for(i = 0; i < size; i++){
		array[i] = myrand(100);
	}
}

/**
 * Attempt to generate a number between 0 and limit without skew
 * @param limit
 * @return
 */
int myrand(int limit){
    int divisor = RAND_MAX/(limit+1);
    int retval;

    do {
        retval = rand() / divisor;
    } while(retval > limit);

	return retval;
}

void initMtx(int_modp **A, size_t m, size_t n, int mod){
	int i, j;
	for(i = 0; i < m; i++){
		for(j = 0; j < n; j++){
			int_modp r1 = { .i = myrand(100), .p = mod };
			A[i][j] = r1;
		}
	}
}

void addMtx(int **A, size_t Am, size_t An, int **B, size_t Bm, size_t Bn){
	if(Am != Bm || An != Bn){
		return;
	}
	
	
}