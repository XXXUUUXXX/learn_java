/*
	ʵ�ֲ�������Ϸ
	 �����һ������,���û���
	 �������:
	 �¶�,����,С��
	�����:Random
	��������:Scanner
	�µ����ֺ�������Ƚ�:if�ж�
	ֱ������Ϊֹ:whileѭ��
*/
import java.util.Random;
import java.util.Scanner;
public class GuestNumber{
	public static void main(String[] args){
		System.out.println("������1-10֮�������");
		//����Scanner�����
		Scanner sc = new Scanner(System.in);
		
		//����Random�����
		Random ran = new Random();
		//����.ʹ�ù���nextInt()��ȡ�����1-10
		int ranNumber = ran.nextInt(10)+1;
		
		while(true){
			//��ȡ��������
			int number = sc.nextInt();
			if(number > ranNumber){
				System.out.println("�´���");
			}else if(number < ranNumber){
				System.out.println("��С��");
			}else{
				System.out.println("�¶���");
				break;
			}
		}
	}
}