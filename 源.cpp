#include <stdio.h>
//%c-打印字符
//%d-打印整形
//%f-浮点
//%p-以地址的形式打印
//%x-打印16进制数字

int main() {
	
	char ch = 'A';
	short int ag = 20;//最大2^16-1=65535
	float f = 5.0;
	double d = 3.14;

  printf("hello world\n");
  printf("%c\n",ch);
  printf("%d\n", ag);
  printf("%lf\n", d);
	

	//printf("%d\n",sizeof(char));//1字节
	//printf("%d\n",sizeof(short));//2
	//printf("%d\n", sizeof(int));//4
	//printf("%d\n", sizeof(long));//4
    //printf("%d\n", sizeof(long long));//8
	//printf("%d\n", sizeof(float));//4
	//printf("%d\n", sizeof(double));//8

  //（公司）字节跳动(ByteDance)-抖音/今日头条等（30w+）

  //计算机单位  bit(比特位)byte kb mb gb tb pb
              //byte(字节) 8个比特位
              //kb 1024
              //...1024倍
  //short(16位)	2的16次方个	  
  //0000000000000000
  //0000000000000001
  //0000000000000010
  //0000000000000011
  //0000000000000100
  // ...
  //1111111111111111


  //123 十进制数字
  //=1*10^2+2*10^1+3*10^0

  short age = 20;
  float weight = 95.6f;//向内存申请4个字节，存放小数(默认double所以加f)

  //c语言标准规定sizeof(long)>=sizeof(int
return 0;
}

//int a = 100;
//int main() {
//	int a = 10;
//	printf("%d\n", a);
//}//局部变量和全局变量名字相同时局部优先



int main() {

	int num1 = 0;
	int num2 = 0;
    int sum = 0;
//c语言语法规定变量要定义在当前代码块的最前面
	scanf_s("%d%d", &num1, &num2);//取地址符号&
	sum= num1 + num2;
	printf("sum =%d\n", sum);
	return 0;
}

//全局变量的作用域是整个工程
//声明extern外部符号








