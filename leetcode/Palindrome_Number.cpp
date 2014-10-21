#include<stdio.h>

class Solution {
public:
    bool isPalindrome(int x) {
        if(x <0)
            return false;
        if(x == 0)
            return true;

        int init = x;
        int reverse=0;
        int remainder = 0;

        while(x != 0){
            remainder = x%10;
            reverse = reverse * 10 + remainder;
            x /= 10;
        }

        return (reverse == init);
    }
};

int main(){
    Solution sln;
    if(sln.isPalindrome(123321)){
        printf("true\n");
    }else{
        printf("false\n");
    }
    return 0;
}

