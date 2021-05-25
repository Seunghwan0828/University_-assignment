//이진탐색트리 배열 입력받아서 탐색
#include <stdio.h>

int BSearch(int ar[],int len,int target)
{
    int first = 0;
    int last = len-1;
    int mid;
    
    while(first <= last)
    {
        mid = (first+last)/2;
        
        if(target == ar[mid])
        {
            return mid;
        }
        else
        {
            if(target < ar[mid])
                last = mid-1;
            else
                first = mid+1;
        }
    }
    return -1;
}

int main(void)
{
    int len,i,idx;
    printf("배열에 입력할 수를 입력하세요 :");
    scanf("%d",&len);
    int arr[len];
    

    for(i=0;i<len;i++)
    {
        scanf("%d",&arr[i]);
    }
    
    idx = BSearch(arr, sizeof(arr)/sizeof(int), 7);
    if(idx == -1)
        printf("탐색실패 \n");
    else
        printf("타겟 저장 인덱스: %d \n",idx);
    
    idx = BSearch(arr, sizeof(arr)/sizeof(int), 4);
    if(idx == -1)
        printf("탐색실패 \n");
    else
        printf("타겟 저장 인덱스: %d \n",idx);
    
    return 0;
}
