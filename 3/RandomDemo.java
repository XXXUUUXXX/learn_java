/*
	java���Ѿ��е���������,Random��
	����:���������
	����:
		1.�����,Random��,��java.util�ļ���
		2.��ʽ:������Random���͵ı���
		3.����.����();  ����Random���еĹ���,���������
		Random��,�ṩ����, nextInt() ����һ�������,�����int����
		����������ķ�Χ,�ڹ���nextInt(дһ������), ����:��������ķ�Χ
		������ķ�Χ�� 0-ָ��������֮��������  nextInt(100) 0-99
		��������������: ������ nextDouble() ������ķ�Χ0.0-1.0
		�����: α�����,�����������д�õ��㷨���ɳ�����
*/
import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
		//��ʽ:�������� ������ = new ��������();
		Random ran = new Random();
		//����.����();
		//Random���е� ����������ķ���
		int i = ran.nextInt(10);
		System.out.println(i);
		
		//���������,��Χ1-100֮��
		ran.nextInt(100) + 1
		
		double d = ran.nextDouble();
		System.out.println(d);

	}
}