#ifndef HEADER_FILE
#define HEADER_FILE

typedef struct {
	int i;
	int p;
} int_modp;

int_modp mul(int_modp a, int_modp b);
int_modp dot(int_modp *a, int_modp *b, size_t len);
int_modp smartDot(int_modp *a, int_modp *b, size_t len);
void initMtx(int_modp **A, size_t m, size_t n);

void printMtx(int**, size_t, size_t);
void addMtx(int **A, size_t Am, size_t An, int **B, size_t Bm, size_t Bn);

#endif