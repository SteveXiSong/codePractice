/**
 * Definition for binary tree
 */

#include<stdio.h>
#include<stack>

struct TreeNode {
      int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

 //*
int main(){

}

class Solution {
public:
    static bool isSymmetric(TreeNode *root) {
        if(root == NULL)
            return true;

        std::stack<TreeNode *> s_left ;
        std::stack<TreeNode *> s_right ;

        s_left.push(root->left);
        s_right.push(root->right);
        
        while( !s_left.empty() && !s_right.empty() ){
            TreeNode *N1 = s_left.top();s_left.pop();
            TreeNode *N2 = s_right.top(); s_right.pop();

            if(N1 == NULL && N2 == NULL)
                continue;
            else if( N1 == NULL || N2 == NULL)
                return false;
            else if( N1->val != N2->val )
                return false;
            s_left.push(N1->left);
            s_right.push(N2->right);
            s_left.push(N1->right);
            s_right.push(N2->left);
        };

        return true;
    }
};
