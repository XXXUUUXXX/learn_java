/*
	if������Ԫ��������滻
	
	�Ѿ�֪��������,�������ֵ
	ʹ��if������Ԫ
	�ж�������,ʹ��if
	��Ԫ�����н��,if����û�н��
*/

public class IfElseDemo_1{
	public static void main(String[] args){
		int i = 7;
		int j = 5;
		//ʹ��if����ж����ֵ
		if(i>j){
			System.out.println(i+"�����ֵ");
		}else{
			System.out.println(j+"�����ֵ");
		}
		//ʹ����Ԫ�����ʵ��
		int k = i>j ? i : j;
		System.out.println(k+"�����ֵ");
	}
}