#include<stdio.h>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> generate(int rowIndex) {
        vector<int> Ans(1);
        vector<int> last(1);
        Ans[0]=1;
        last = Ans;
        if(rowIndex == 0)
            return Ans;

        for(int i = 1; i <= rowIndex ; i++){
            Ans.resize(rowIndex+1);
            Ans[0]=1;
            Ans[rowIndex]=1;
            for(int j = 1; j < rowIndex; j++){
                Ans[j] = last[j-1] + last[j];
            }
            last = Ans;
        }
        return Ans;
    }
};

int main(){
    Solution sln;
    int n = 2;
    vector<int> ans = sln.generate(n);
    for(int i = 0;i <= n;i++){
            printf("%d ", ans[i]);
    }
    return 0;
}
