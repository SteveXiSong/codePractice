#include<stdio.h>

class Solution {
public:
    static int removeDuplicates(int A[], int n) {
        int retSize = n;
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        int dis = 0;
        for(int curPos=0, dupPos=1;curPos < retSize; curPos++){
            dupPos = curPos+1;

            while(A[dupPos] == A[curPos]){
                dupPos++;
            }

            dis = dupPos - curPos - 1;

            while(dupPos < retSize && dis > 0){
                A[dupPos-dis]=A[dupPos];
                dupPos++;
            }
            retSize -= dis;
        }
        return retSize;
    }
};


int main(){
    int A[] = { 0, 0, 1, 1, 1, 2, 3, 4,4,4, 5};
    int size = 11;
    for(int i =0; i< size; i++)
        printf("%d", A[i]);

    Solution sl;
    int retSize = sl.removeDuplicates(A,size);

    for(int i =0; i< retSize; i++)
        printf("%d", A[i]);

    return 0;
}
