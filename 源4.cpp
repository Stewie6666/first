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

	int m = 0;//4���ֽڣ�32bitλ
	int n = ~m;
	//~--����2���ƣ�λȡ��
	//000000000000000000000000
	//111111111111111111111111
	//ԭ�롢���롢����
	//�������ڴ��д洢��ʱ��洢���Ƕ����ƵĲ���
	//111111111111111111111111
	//111111111111111111111110
	//100000000000000000000001
	printf("%d\n", n);//-1
	//ʹ�õģ���ӡ�����������ԭ��


	int q = 10;
	int p = 10;
	int w = q++;//����++����ʹ�ã���++
	int e = ++p;//ǰ��++����++����ʹ��
	printf("%d %d\n",q,w);//11 10
	printf("%d %d\n",p,e);//11 11

	int r = 100;
	int t = 20;
	int max = 0;
	max = (r > t ? r : t);//����������
	/*ͬif (r > t)
		max = r;
	else
		max = t;*/
	printf("%d\n", max);

	//�����ؼ��֣�auto break case char const continue default
	//do double else enum extern float for goto if int long register
	//return short signed sizeof static struct switch typedef union
	//unsigned void volatile while
     
	register int u = 10;//�����u����ɼĴ�������
	//signed int;int;unsigned int(�޷���)
	
	typedef unsigned int u_int;
	//typrdef--�����ض���
	unsigned int num = 20;
	u_int num2 = 20;//������������


	return 0;
}







