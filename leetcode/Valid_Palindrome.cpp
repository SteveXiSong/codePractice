#include<string>
#include<stdio.h>
using namespace std;

class Solution {
public:
    bool isPalindrome(string s) {
        if( s.empty())
            return true;

        for(string::iterator it_front = s.begin(), it_back = (--s.end()); it_front != it_back; ){
            while( it_front != it_back && !isalnum(*it_front) ) it_front++;
            while( it_front != it_back && !isalnum(*it_back) ) it_back--;
            char front = *it_front, back = *it_back;
            printf("%c %c\n", front, back);
            if( toupper(front) != toupper(back))
                return false;
            it_front++;
            it_back--;
        }
        return true;
    }
};

int main(){
    string test("this a asiht");
    string test1("this a bcde");
    Solution sln;
    //if(sln.isPalindrome(test1))
    if(sln.isPalindrome(test))
        printf("true\n");
    else
        printf("false\n");
    return 0;
}
