#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//ö�ٳ��� (�Ա���ɫ�����ڵ�)
enum Sex {
	MALE,
	FEMALE,
	SECRET
};
int main(){

	//const - ������
	//const
	// int num = 5;//num���ܸ�
	//scanf("%d", &num);
	//printf("%d\n", num);

//#define�����ʶ������
	//enum Sex s = FEMALE;
	//printf("%d\n", MALE);//0
	//printf("%d\n", FEMALE);//1
	//printf("%d\n", SECRET);//2

	char arr1[] = "abc";
	//"abc"--'a''b''c''\0'--'\0'�ַ����Ľ�����־
	char arr2[] = { 'a','b','c','\0'};
	printf("%s\n",arr1);
	printf("%s\n",arr2);



	


	


	return 0;
}



//ASCII ����