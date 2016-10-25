#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int myrand(int);
void initRow(int*, size_t);
void printMtx(int**, size_t, size_t);
void addMtx(int[][], int[][]);

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
 
    return 0;
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

void addMtx(int** A, int** B){

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