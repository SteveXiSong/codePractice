#include<string>
#include<stdio.h>
using namespace std;

class Solution {
public:
    bool isPalindrome(string s) {
        if( s.empty())
            return true;

        for(string::iterator it_front = s.begin(), it_back = (--s.end()); it_front < it_back; ){
            while( it_front < it_back && !isalnum(*it_front) ) it_front++;
            while( it_front < it_back && !isalnum(*it_back) ) it_back--;
            printf("%c %c\n", *it_front, *it_back);
            if( toupper(*it_front) != toupper(*it_back))
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
    string test2("!!!");
    string test3("a.");
    Solution sln;
    if(sln.isPalindrome(test3))
        printf("true\n");
    else
        printf("false\n");
    return 0;
}
