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
//	int m = 0;//4���ֽڣ�32bitλ
//	int n = ~m;
//	//~--����2���ƣ�λȡ��
//	//000000000000000000000000
//	//111111111111111111111111
//	//ԭ�롢���롢����
//	//�������ڴ��д洢��ʱ��洢���Ƕ����ƵĲ���
//	//111111111111111111111111
//	//111111111111111111111110
//	//100000000000000000000001
//	printf("%d\n", n);//-1
//	//ʹ�õģ���ӡ�����������ԭ��
//
//
//	int q = 10;
//	int p = 10;
//	int w = q++;//����++����ʹ�ã���++
//	int e = ++p;//ǰ��++����++����ʹ��
//	printf("%d %d\n",q,w);//11 10
//	printf("%d %d\n",p,e);//11 11
//
//	int r = 100;
//	int t = 20;
//	int max = 0;
//	max = (r > t ? r : t);//����������
//	/*ͬif (r > t)
//		max = r;
//	else
//		max = t;*/
//	printf("%d\n", max);
//
//	//�����ؼ��֣�auto break case char const continue default
//	//do double else enum extern float for goto if int long register
//	//return short signed sizeof static struct switch typedef union
//	//unsigned void volatile while
//     
//	register int u = 10;//�����u����ɼĴ�������
//	//signed int;int;unsigned int(�޷���)
//	
//	typedef unsigned int u_int;
//	//typrdef--�����ض���
//	unsigned int num = 20;
//	u_int num2 = 20;//������������
//	return 0;
//}



////1.static���ξֲ�����
////�ֲ��������������ڱ䳤
//	void test(){
//		static int a = 1;//a��һ����̬�ľֲ�����
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


////2.static����ȫ�ֱ���
////�ı���ȫ�ֱ�����������-�þ�̬��ȫ�ֱ���ֻ�����Լ����ڵ�Դ�ļ��ڲ�ʹ��
//int main() {
//	//extern-�����ⲿ���ŵ�
//	extern int g_val;
//	printf("g_val=%d\n", g_val);
//	return 0;
//}



////3.static���κ���
////static���κ���Ҳ�ı��˺�����������-��׼ȷ
////static���κ����ı��˺�������������
////�ⲿ��������->�ڲ���������
////�����ⲿ����
//extern int Add(int, int);
//int main() {
//	int a = 10;
//	int b = 20;
//	int sum = Add(a, b);
//	printf("sum=%d\n", sum);
//	return 0;
//}


//#define �����ʶ������
//#define MAX 100
//#define ���Զ����--������
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
	//����
	int max = Max(a, b);
	printf("max=%d\n", max);
	//��ķ�ʽ
	max = MAX(a, b);
	//max=(a>b?a:b)
	printf("max=%d\n", max);
	return 0;
}

    /*��ַ����>�ռ䣨���䣩
	*��β�����ַ
	* 32λ  32����ַ��/������
	* ����͸���
	*   1     0
	* 00000000000000000000000000000000
	* 00000000000000000000000000000001
	* 00000000000000000000000000000010
	* ......
	* 01111111111111111111111111111111
	* 10000000000000000000000000000000
	* ......
	* 11111111111111111111111111111111
	* 2^32�����
	
	
	
	
	
	*/


















