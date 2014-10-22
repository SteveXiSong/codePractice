#include<stdio.h>
#include<vector>
#include<string>
#include<iostream>

using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string> &strs) {
        if(strs.size() == 0)
            return "";

        string retStr =  strs[0];
        for(int i=1; i < strs.size(); i++){
            int k =0;
            while(k< retStr.size() && strs[i][k] == retStr[k]) k++;
            if(k == 0)
                return "";
            retStr = retStr.substr(0,k);
        }
        return retStr;
    }
};

int main(){
    vector<string> test(3);
    test[0] = "test1";
        
    test[1] = "test2";
    test[2] = "tes3";
    Solution sln;
    string ans = sln.longestCommonPrefix(test);
    cout << ans << endl;
    return 0;
}
