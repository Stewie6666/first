#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//枚举常量 (性别，颜色，星期等)
enum Sex {
	MALE,
	FEMALE,
	SECRET
};
int main(){

	//const - 常属性
	//const
	// int num = 5;//num不能改
	//scanf("%d", &num);
	//printf("%d\n", num);

//#define定义标识符常量
	//enum Sex s = FEMALE;
	//printf("%d\n", MALE);//0
	//printf("%d\n", FEMALE);//1
	//printf("%d\n", SECRET);//2

	char arr1[] = "abc";
	//"abc"--'a''b''c''\0'--'\0'字符串的结束标志
	char arr2[] = { 'a','b','c','\0'};
	printf("%s\n",arr1);
	printf("%s\n",arr2);



	


	


	return 0;
}



//ASCII 编码