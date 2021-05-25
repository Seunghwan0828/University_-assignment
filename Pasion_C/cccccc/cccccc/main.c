//
//  main.c
//  cccccc
//
//  Created by 정승환 on 2021/01/15.
//

#include <stdio.h>
#include <string.h>
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* s) {
    int i;
    char arr[100]={};
    char *c,*v;
    s = arr;
    i = (strlen(s)/2);
    c= s[i-1];
    v= s[i];
    if(strlen(s)%2==0){
        strcat(c,v);
        return c;
    }
    else
        return v;
}

int main(void) {
    char *s;
    char *y;
    scanf("%s",s);
    y = solution(s);
    printf("%s \n",y);
    return 0;
}
