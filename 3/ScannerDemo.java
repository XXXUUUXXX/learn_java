/*
	������������,�� Scanner
	����ֱ��ʹ�õ���
	���������������ͱ���,�ͻ������ͱ�������
	int a = 1;
	��ʽ:
		���� ������ = new ����();
	����:������Scanner��ı���
		Scanner sc = new Scanner();
	ÿ����������,�����Լ��Ĺ���
	ʹ�ù���,��ʽ:
		������.������();
	Scanner��,����:�������н��ܼ��̵�����
	ʹ��Scanner�ಽ��:
		1.�����,ָ�������ڵ��ļ���,import java.util.Scanner;
		  java�ļ���-util�ļ���
		2.��ʽ,������Scanner���ͱ���
		3.����.ʹ��Scanner���еĹ���,��ɼ�������
*/
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		//���� ������ = new ����();
		//������Scanner,�����
		Scanner sc = new Scanner(System.in);
		//����.������();  ���ռ�������
		//����:nextInt() ���ռ�������,��֤�����������
		//�������ܵ����ݾ�������,�������к�Ľ��������������
		int i = sc.nextInt();
		System.out.println(i+1);
		
		//Scanner�����һ������  next()���ռ���������ַ���
		String s = sc.next();
		System.out.println(s);
	}
}