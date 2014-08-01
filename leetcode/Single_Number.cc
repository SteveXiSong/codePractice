class Solution {
public:
    int singleNumber(int A[], int n) {
        int theOne=0;
        int i=0;
        if(A==NULL) return 0;
        if(n<=0)return 0;
        if(n==1)return A[0];
        theOne = A[i++];
        for(i=1;i<n;i++){
            theOne = theOne^A[i];
        }
        return theOne;
    }
};
