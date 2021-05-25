#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>

static double count = 0;

void count_up() {
    count++;
}

double nf_repeat(int n) {
    double result=1;
    for(int i=1; i<=n; i++)
    {
        count_up();
        result = result * i;
        sleep(0.1);
    }
    return result;
}

double nf_recurrsive(int n) {
    count_up();
    if (n == 1)
        return 1;
    else
        sleep(0.1);
        return n * nf_recurrsive(n - 1);
}


int main(void)
{
    clock_t start, finish;
    double duration;
    printf("----------------------------------------------------\n");
    printf("반복적 방법으로 n! 구한 값\n\n");
    count = 0;
    start = clock();
    double nf_data0 = nf_repeat(10);
    printf("%d번째 수는 %.f입니다.\n", 10, nf_data0);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    start = clock();
    double nf_data1 = nf_repeat(50);
    printf("%d번째 수는 %.f입니다.\n", 50, nf_data1);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    start = clock();
    double nf_data2 = nf_repeat(100);
    printf("%d번째 수는 %.f입니다.\n", 100, nf_data2);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    start = clock();
    double nf_data3 = nf_repeat(150);
    printf("%d번째 수는 %.f입니다.\n", 150, nf_data3);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    double nf_data4 = nf_repeat(200);
    printf("%d번째 수는 %.f입니다.\n", 200, nf_data4);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    printf("----------------------------------------------------\n\n");
    printf("----------------------------------------------------\n");
    printf("재귀함수로 n! 구한 값\n\n");
    count = 0;
    start = clock();
    double nfr_data0 = nf_recurrsive(10);
    printf("%d번째 수는 %.f입니다.\n", 10, nfr_data0);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    start = clock();
    double nfr_data1 = nf_recurrsive(50);
    printf("%d번째 수는 %.f입니다.\n", 50, nfr_data1);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    start = clock();
    double nfr_data2 = nf_recurrsive(100);
    printf("%d번째 수는 %.f입니다.\n", 100, nfr_data2);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    start = clock();
    double nfr_data3 = nf_recurrsive(150);
    printf("%d번째 수는 %.f입니다.\n", 150, nfr_data3);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    count = 0;
    start = clock();
    double nfr_data4 = nf_recurrsive(200);
    printf("%d번째 수는 %.f입니다.\n", 200, nfr_data4);
    printf("함수 실행 횟수는 %.f입니다.\n", count);
    finish = clock();
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("%f 초입니다.\n\n", duration);
    printf("----------------------------------------------------\n");
    system("read");
    return 0;
}
