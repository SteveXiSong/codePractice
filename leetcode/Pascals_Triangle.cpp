#include<stdio.h>
#include<vector>

using namespace std;

class Solution {
public:
    vector<vector<int> > generate(int numRows) {
        vector< vector<int> > Ans(numRows);
        if(numRows == 0)
            return Ans;

        vector<int> lastRow(1);
        lastRow[0] = 1;
        Ans[0] = lastRow;

        for(int rowNo = 1; rowNo < numRows; rowNo++){
            vector<int> row(rowNo+1);
            row[0] = 1;
            row[rowNo] = 1;
            for(int pos = 1; pos < rowNo; pos++){
                    row[pos] = lastRow[pos-1]+lastRow[pos];
            }
            Ans[rowNo] = row;
            lastRow = row;
        }
        return Ans;
    }
};

int main(){
    Solution sln;
    int n = 4;
    vector<vector<int> > ans = sln.generate(n);
    for(int i = 0;i < n;i++){
        for(int j = 0; j <= i; j++){
            printf("%d ", ans[i][j]);
        }
        printf("\n");
    }
    return 0;
}
