#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int Add(int x, int y) {
	int z= x + y;
	return z;
}
int main() {
	int num1 = 10;
	int num2 = 20;
	int sum = 0;
	int a = 100;
	int b = 200;
	sum = Add(num1, num2);
	sum = Add(a, b);
	//sum = num1 + num2;
	printf("sum =%d\n", sum);
	/*int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;*/
	int arr[4] = { 1,2,3,4 };
 //char arr[] float arr[]
	int i = 0;
	while(i<4){
        printf("%d\n", arr[i]);
		i++;
      }

	int m = 1;
	int d = m << 1;//左移1 结果为1*2^1
    int e = m << 2;//结果为1*2^2
   
	printf("%d\n", d);















	return 0;
}
