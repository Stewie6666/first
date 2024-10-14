#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//枚举常量 (性别，颜色，星期等)
enum Sex {
	MALE,
	FEMALE,
	SECRET
};
int main(){

	/*const - 常属性
	const
	 int num = 5;//num不能改
	scanf("%d", &num);
	printf("%d\n", num);
*/
/*define定义标识符常量
	enum Sex s = FEMALE;
	printf("%d\n", MALE);//0
	printf("%d\n", FEMALE);//1
	printf("%d\n", SECRET);//2
*/
	char arr1[] = "abc";
	//"abc"--'a''b''c''\0'--'\0'字符串的结束标志
	char arr2[] = { 'a','b','c','\0'};
	printf("%s\n",arr1);
	printf("%s\n",arr2);
	//转义字符是一个字符
	//printf("aaa\n");
	//\t-水平制表符
	//用\取消转义
	printf("c:\\test\\32\\test.c");
	printf("\"");
	//printf("%d\n", strlen("c:\test\32\test.c"));字符长度为13（\32和\t都为一个字符）
	//\32是两个8进制数字 转化为十进制为3*8^1+2*8^0=26
	//ASCII 编码十进制48--0  65--A  97--a  Aa差值为32
	/*ctrl k c注释ctrl k u取消*/
	int input = 0;
	printf(" ？(1/0)>:\n");
	scanf("%d" ,&input);
	if (input == 1)
		printf("yes");
	else
		printf("no");
	while
	printf("敲一行代码\n");





	return 0;

}




//ASCII 编码