/*
	��ֵ�����
	=
	+= -+ *= /+ %=
*/

public class Operator_2{
	public static void main(String[] args){
		// = ��ֵ����,�������ֵ��ֵ����ߵı���
		int i = 3;
		i = i + 3;
		System.out.println(i);
		
		// += ��ֵ����� i+=3 i=i+3
		int j = 5;
		j += 5;
		System.out.println(j);
		
		byte b = 1;
		b = (byte)(b + 1);
		System.out.println(b);
		
		byte b1 = 1;
		b1 += 1;//�൱��b1 = (byte)(b+1)
		System.out.println(b1);
	}
}