/*
	����:�ն���õ�Phone��
	�����������ͱ����ĸ�ʽ
		�������� ������ = new ��������();
	ʵ���������͵Ĳ���:
		1.����� ����ͬһ���ļ��в���Ҫ�����
		2.�����������͵ı���
		3.����.�����еĹ���
*/
public class TestPhone{
	public static void main(String[] args){
		//����Ӧ�����͵ı���
		Phone p = new Phone();
		//System.out.println(p);
		//����.�����еĹ���
		//���� p.��ʽ,�������е�����
		//���Ծ��Ǳ���
		p.color = "gold tuhao";
		p.brand = "apple";
		p.size = 15.0;
		
		//��ȡ����ֵ
		System.out.println(p.color+"    "+p.brand+"    "+p.size+"     ");
	}
}