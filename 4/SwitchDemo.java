/*
	ѡ����� switch���
	��if������䲻ͬ,ֻ�����ĳ�����ʽ��ֵ�����ж�
	��д��ʽ:
		switch(���ʽ){
			case ����1: 
				Ҫִ�е����;
			break;
			
			case ����2: 
				Ҫִ�е����;
			break;
			
			default:
				Ҫִ�е����;
			break;
		}
		ִ������:���ʽ,��case����ĳ������бȽ�
		���ĸ�case��ĳ�����ͬ,��ִ���ĸ�case����ĳ���,����break,��ȫ����
		���û���ҵ��κ�ƥ��ֵ,��ִ��default������
		switch����б��ʽ����������,����Ҫ���
		JDK1.0-1.4 �������ͽ��� byte short int char
		JDK1.5	   �������ͽ��� byte short int char enum(ö��)
		JDK1.7 	   �������ͽ��� byte short int char enum String
		���case���������ִ�����һ��,��ִ�����ֻ��дһ�μ���
*/
public class SwitchDemo{
	public static void main(String[] args){
		//�������,�������ڼ�������
		int week = 8;
		//switch���
		switch(week){
			case 1:
			System.out.println("����1");
			break;
			
			case 2:
			System.out.println("����2");
			break;
			
			case 3:
			System.out.println("����3");
			break;
			
			case 4:
			System.out.println("����4");
			break;
			
			case 5:
			System.out.println("����5");
			break;
			
			case 6:
			System.out.println("����6");
			break;
			
			case 7:
			System.out.println("������");
			break;
			
			default:
				System.out.println("������");
			break;
		}
	}
}