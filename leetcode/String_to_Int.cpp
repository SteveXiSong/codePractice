#include<stdio.h>
#define MAXINT 2147483647
#define MININT -2147483648

class Solution {
public:
    int atoi(const char *str) {
        int retVal=0;
        long recordVal=0;
        bool isPos = true;
        bool isRecording = false;

        if(str == NULL)
            return 0;
        for(int i=0; str[i] != '\0';i++){
            printf("(%c)\n", str[i]);
            if(str[i] == ' '){
                if(isRecording == false){
                    continue;
                }else{
                    break;
                }
            }
            else if(str[i] == '+' ){
                if(isRecording == false){
                    isPos = true;
                    isRecording = true;
                }
                else{
                    return 0;
                }
            }
            else if(str[i] == '-' ){
                if(isRecording == false){
                    isPos = false;
                    isRecording = true;
                }else{
                    return 0;
                }
            }
            else if( str[i] >= '0' && str[i] <= '9'){
                printf("[%c]\n", str[i]);
                recordVal = recordVal*10+(str[i] - '0');
                isRecording = true;
            }
            else if(isRecording){
                break;
            }
        }

        if(recordVal > MAXINT){
            recordVal = MAXINT;
        }
        if(recordVal < MININT){
            recordVal = MININT;
        }

        retVal = (int)recordVal;
        return isPos?retVal:-retVal;
    }
};


int main(){
    char test[] = "  +123456 what";
    char test1[] = "+1";
    char testMax[] = "2147483648";
    Solution sln;
    //int retVal = sln.atoi(test);
    int retVal = sln.atoi(testMax);
    printf("return value is %d\n", retVal);
    return 0;
}
