#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
//ö�ٳ��� (�Ա���ɫ�����ڵ�)
enum Sex {
	MALE,
	FEMALE,
	SECRET
};
int main(){

	/*const - ������
	const
	 int num = 5;//num���ܸ�
	scanf("%d", &num);
	printf("%d\n", num);
*/
/*define�����ʶ������
	enum Sex s = FEMALE;
	printf("%d\n", MALE);//0
	printf("%d\n", FEMALE);//1
	printf("%d\n", SECRET);//2
*/
	char arr1[] = "abc";
	//"abc"--'a''b''c''\0'--'\0'�ַ����Ľ�����־
	char arr2[] = { 'a','b','c','\0'};
	printf("%s\n",arr1);
	printf("%s\n",arr2);
	//ת���ַ���һ���ַ�
	//printf("aaa\n");
	//\t-ˮƽ�Ʊ��
	//��\ȡ��ת��
	printf("c:\\test\\32\\test.c");
	printf("\"");
	//printf("%d\n", strlen("c:\test\32\test.c"));�ַ�����Ϊ13��\32��\t��Ϊһ���ַ���
	//\32������8�������� ת��Ϊʮ����Ϊ3*8^1+2*8^0=26
	//ASCII ����ʮ����48--0  65--A  97--a  Aa��ֵΪ32
	/*ctrl k cע��ctrl k uȡ��*/
	int input = 0;
	printf(" ��(1/0)>:\n");
	scanf("%d" ,&input);
	if (input == 1)
		printf("yes");
	else
		printf("no");
	while
	printf("��һ�д���\n");





	return 0;

}




//ASCII ����