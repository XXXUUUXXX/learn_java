/*
	if else if else���
	�ʺ��ڳ�����,ʵ�ֶ��������ж�
	��д��ʽ:
	  if(����1){
		  ifִ����1
	  }else if(����2){
		  ifִ����2
	  }else{
		  elseִ����
	  }
	  һ�������,�������if,ֻҪ1��if��������true,�������벻��ִ��
	  
*/

public class IfElseIfDemo{
	public static void main(String[] args){
		//�ɼ��ж�Ҫ��,�ɼ�>80 �ɼ�>70 �ɼ�>60 ������
		//�������,����ɼ�
		int grade = 75;
		if(grade > 80){
			System.out.println("����");
		}else if(grade > 70){
			System.out.println("����");
		}else if(grade > 60){
			System.out.println("�ϸ�");
		}else{
			System.out.println("������");
		}
	}
}