
#include <stdio.h>

int main(void) {
    int i,big=0;
    int x[]={2,4,6,1,8,90};
    for(i=1; i< sizeof(x)/sizeof(int); i++)
        if(x[i]>x[i-1])
            big = i;
    printf("%d\n",x[big]);
    return 0;
}
