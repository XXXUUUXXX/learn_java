/*
	�����ֻ���
	  ����2���ֻ���ı���
*/
public class TestPhone_1{
	public static void main(String[] args){
		//�����ֻ����ͱ���
		Phone p1 = new Phone();
		
		//�ٴδ����ֻ����ͱ���
		Phone p2 = new Phone();
		
		p1.color = "white";
		p1.brand = "xiaomi";
		p1.size = 5.5;
		
		p2.brand = "huawei";
		System.out.println(p1.brand);
		System.out.println(p2.brand);
	}
}