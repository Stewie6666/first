#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <iostream>
#include <cstddef> 
//int main() {
//	int a = 10;
//	int arr[] = { 1,2,3,4,5,6 };
//	printf("%d\n", sizeof(a));//4
//	printf("%d\n", sizeof(arr));//4*6=24
//	printf("%d\n", sizeof(arr)/sizeof(arr[0]));//6
//
//	int m = 0;//4个字节，32bit位
//	int n = ~m;
//	//~--按（2进制）位取反
//	//000000000000000000000000
//	//111111111111111111111111
//	//原码、反码、补码
//	//负数在内存中存储的时候存储的是二进制的补码
//	//111111111111111111111111
//	//111111111111111111111110
//	//100000000000000000000001
//	printf("%d\n", n);//-1
//	//使用的，打印的是这个数的原码
//
//
//	int q = 10;
//	int p = 10;
//	int w = q++;//后置++，先使用，再++
//	int e = ++p;//前置++，先++，再使用
//	printf("%d %d\n",q,w);//11 10
//	printf("%d %d\n",p,e);//11 11
//
//	int r = 100;
//	int t = 20;
//	int max = 0;
//	max = (r > t ? r : t);//条件操作符
//	/*同if (r > t)
//		max = r;
//	else
//		max = t;*/
//	printf("%d\n", max);
//
//	//常见关键字：auto break case char const continue default
//	//do double else enum extern float for goto if int long register
//	//return short signed sizeof static struct switch typedef union
//	//unsigned void volatile while
//     
//	register int u = 10;//建议把u定义成寄存器变量
//	//signed int;int;unsigned int(无符号)
//	
//	typedef unsigned int u_int;
//	//typrdef--类型重定义
//	unsigned int num = 20;
//	u_int num2 = 20;//和上行无区别
//	return 0;
//}



////1.static修饰局部变量
////局部变量的生命周期变长
//	void test(){
//		static int a = 1;//a是一个静态的局部变量
//		a++;
//		printf("a=%d\n", a);
//	}
//	int main() {
//		int i = 0;
//		while (i < 5) {
//			test();
//			i++;
//		}
//		return 0;
//	}


////2.static修饰全局变量
////改变了全局变量的作用域-让静态的全局变量只能在自己所在的源文件内部使用
//int main() {
//	//extern-声明外部符号的
//	extern int g_val;
//	printf("g_val=%d\n", g_val);
//	return 0;
//}



////3.static修饰函数
////static修饰函数也改变了函数的作用域-不准确
////static修饰函数改变了函数的链接属性
////外部链接属性->内部链接属性
////声明外部函数
//extern int Add(int, int);
//int main() {
//	int a = 10;
//	int b = 20;
//	int sum = Add(a, b);
//	printf("sum=%d\n", sum);
//	return 0;
//}


//#define 定义标识符常量
//#define MAX 100
//#define 可以定义宏--带参数
int Max(int x, int y) {
	if (x > y)
		return x;
	else
		return y;
}
#define MAX(X,Y) (X>Y?X:Y)
int main() {
	//int a = MAX;
	int a = 10;
	int b = 20;
	//函数
	int max = Max(a, b);
	printf("max=%d\n", max);
	//宏的方式
	max = MAX(a, b);
	//max=(a>b?a:b)
	printf("max=%d\n", max);
	return 0;
}

    /*地址——>空间（房间）
	*如何产生地址
	* 32位  32根地址线/数据线
	* 正电和负电
	*   1     0
	* 00000000000000000000000000000000
	* 00000000000000000000000000000001
	* 00000000000000000000000000000010
	* ......
	* 01111111111111111111111111111111
	* 10000000000000000000000000000000
	* ......
	* 11111111111111111111111111111111
	* 2^32个编号
	
	
	
	
	
	*/


















