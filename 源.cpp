#include <stdio.h>
//%c-��ӡ�ַ�
//%d-��ӡ����
//%f-����
//%p-�Ե�ַ����ʽ��ӡ
//%x-��ӡ16��������

int main() {
	
	char ch = 'A';
	short int ag = 20;//���2^16-1=65535
	float f = 5.0;
	double d = 3.14;

  printf("hello world\n");
  printf("%c\n",ch);
  printf("%d\n", ag);
  printf("%lf\n", d);
	

	//printf("%d\n",sizeof(char));//1�ֽ�
	//printf("%d\n",sizeof(short));//2
	//printf("%d\n", sizeof(int));//4
	//printf("%d\n", sizeof(long));//4
    //printf("%d\n", sizeof(long long));//8
	//printf("%d\n", sizeof(float));//4
	//printf("%d\n", sizeof(double));//8

  //����˾���ֽ�����(ByteDance)-����/����ͷ���ȣ�30w+��

  //�������λ  bit(����λ)byte kb mb gb tb pb
              //byte(�ֽ�) 8������λ
              //kb 1024
              //...1024��
  //short(16λ)	2��16�η���	  
  //0000000000000000
  //0000000000000001
  //0000000000000010
  //0000000000000011
  //0000000000000100
  // ...
  //1111111111111111


  //123 ʮ��������
  //=1*10^2+2*10^1+3*10^0

  short age = 20;
  float weight = 95.6f;//���ڴ�����4���ֽڣ����С��(Ĭ��double���Լ�f)

  //c���Ա�׼�涨sizeof(long)>=sizeof(int
return 0;
}

//int a = 100;
//int main() {
//	int a = 10;
//	printf("%d\n", a);
//}//�ֲ�������ȫ�ֱ���������ͬʱ�ֲ�����



int main() {

	int num1 = 0;
	int num2 = 0;
    int sum = 0;
//c�����﷨�涨����Ҫ�����ڵ�ǰ��������ǰ��
	scanf_s("%d%d", &num1, &num2);//ȡ��ַ����&
	sum= num1 + num2;
	printf("sum =%d\n", sum);
	return 0;
}

//ȫ�ֱ���������������������
//����extern�ⲿ����








