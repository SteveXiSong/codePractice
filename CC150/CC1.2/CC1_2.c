#include<stdio.h>
#include<string.h>

void swap(char *a, char *b);
void reverse(char* s);

void main(){
	char s[] = "this is a test\n";
	printf("%s,%d",s,(int)strlen(s));	
	reverse(s);
	printf("%s",s);	
}

void swap(char *a, char *b){
	char c = *a;
	*a = *b;
	*b = c;
}

void reverse(char *s){
	if(*s == null)
		return;
	
	char *front, *back;
	front = s;
	back = front + strlen(s) -1;
	
	while( front < back){
		swap(front, back);
		front ++;
		back --;
	}

}
