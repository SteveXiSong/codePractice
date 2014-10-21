#include<string>
#include<stack>
#include<stdio.h>
#include<iostream>

using namespace std;
class num_val{
    public:
    int num, val;
    num_val(int x, int y):num(x),val(y){};
};


class Solution {
public:
    string countAndSay(int n) {
        if(n == 0)
            return NULL;

        string retStr;
        stack<num_val> s_num_val;

        int val, last_val = n%10;
        int num = 1;
        do{
            n /= 10;
            val = n%10;
            if(last_val == val){
                num++;
            }
            else{
                class num_val num_val_pair(num, last_val);
                s_num_val.push(num_val_pair);
                printf("[%d %d] ",num, last_val);
                num = 1;
                last_val = val;
            }
        }while(n!=0);

        while( !s_num_val.empty()){
            num_val num_val_pair = s_num_val.top(); 
            s_num_val.pop();
            switch(num_val_pair.num){
                case 1:
                    retStr.append("one");
                    break;
                case 2:
                    retStr.append("two");
                    break;
                case 3:
                    retStr.append("three");
                    break;
                case 4:
                    retStr.append("four");
                    break;
                case 5:
                    retStr.append("five");
                    break;
                case 6:
                    retStr.append("six");
                    break;
                case 7:
                    retStr.append("seven");
                    break;
                case 8:
                    retStr.append("eight");
                    break;
                case 9:
                    retStr.append("nine");
                    break;
                default:
                    printf("Error\n");
                    break;
            }
            switch(num_val_pair.val){
                case 1:
                    retStr.append(" 1");
                    break;
                case 2:
                    retStr.append(" 2");
                    break;
                case 3:
                    retStr.append(" 3");
                    break;
                case 4:
                    retStr.append(" 4");
                    break;
                case 5:
                    retStr.append(" 5");
                    break;
                case 6:
                    retStr.append(" 6");
                    break;
                case 7:
                    retStr.append(" 7");
                    break;
                case 8:
                    retStr.append(" 8");
                    break;
                case 9:
                    retStr.append(" 9");
                    break;
                default:
                    printf("Error\n");
                    break;
            }
            if(!s_num_val.empty())
                retStr.append(" ");
        }

        return retStr;
    }
};

int main(){
    int test = 1223334444;
    Solution sln;
    string ans = sln.countAndSay(test);
    cout<< ans <<endl;
    return 0;
}
