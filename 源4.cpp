#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <iostream>
#include <cstddef> 
int main() {
	int a = 10;
	int arr[] = { 1,2,3,4,5,6 };
	printf("%d\n", sizeof(a));//4
	printf("%d\n", sizeof(arr));//4*6=24
	printf("%d\n", sizeof(arr)/sizeof(arr[0]));//6

	int m = 0;//4个字节，32bit位
	int n = ~m;
	//~--按（2进制）位取反
	//000000000000000000000000
	//111111111111111111111111
	//原码、反码、补码
	//负数在内存中存储的时候存储的是二进制的补码
	//111111111111111111111111
	//111111111111111111111110
	//100000000000000000000001
	printf("%d\n", n);//-1
	//使用的，打印的是这个数的原码


	int q = 10;
	int p = 10;
	int w = q++;//后置++，先使用，再++
	int e = ++p;//前置++，先++，再使用
	printf("%d %d\n",q,w);//11 10
	printf("%d %d\n",p,e);//11 11

	int r = 100;
	int t = 20;
	int max = 0;
	max = (r > t ? r : t);//条件操作符
	/*同if (r > t)
		max = r;
	else
		max = t;*/
	printf("%d\n", max);

	//常见关键字：auto break case char const continue default
	//do double else enum extern float for goto if int long register
	//return short signed sizeof static struct switch typedef union
	//unsigned void volatile while
     
	register int u = 10;//建议把u定义成寄存器变量
	//signed int;int;unsigned int(无符号)
	
	typedef unsigned int u_int;
	//typrdef--类型重定义
	unsigned int num = 20;
	u_int num2 = 20;//和上行无区别


	return 0;
}







