/*
	ʵ����Ʒ�Ŀ�����
	  ����:
		1.չʾ�û�ѡ�����嵥
		2.����ѡ��Ĺ��ܱ��,���в�ͬ�Ĳ���
			A.չʾ���п��
			B.�޸Ŀ������
	  ����:
		1.չʾ�û��嵥:
			������,�û�����,ѡ�������
		2.����ѡ��,���ò�ͬ�ķ���
			switch���
				case 1 2 3
			A չʾ���
				���洢��Ʒ������,����
			B �޸Ŀ��
				�޸����еĿ������
*/
import java.util.Scanner;
public class Shopp{
	public static void main(String[] args){
		//ʹ������,������Ʒ����Ϣ
		//Ʒ��,�ߴ�,�۸�,�����,��������
		String[] brand = {"Mac","ThinkPad"};
		double[] size = {13.3,14};
		double[] price = {9984.97,6565.66};
		int[] count = {0,0};
		while(true){
			int choose = chooseFunction();
			switch(choose){
				case 1:
					//���ò鿴����嵥����
					printStore(brand,size,price,count);
				break;
				
				case 2:
					//�����޸Ŀ��ķ���
					update(count,brand);
				break;
				
				case 3:
					return;//��������
				
				default:
					System.out.println("û���������");
				break;
			}
		}
	}
	
	/*
		���巽��,�޸�������Ʒ�Ŀ��
		�û�����һ��,�޸�һ��
		����ֵ û��
		���� �����������
	*/
	public static void update(int[] count,String[] brand){
		//��������,������һ��,�޸�һ��
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
		//��������
		for(int i = 0; i < brand.length; i++){
			System.out.println("������"+brand[i]+"�����");
			//��������,¼����,�洢�������������
			int newCount = sc.nextInt();
			count[i] = newCount;
		}
		
	}
	
	/*
		���巽��,չʾ���п���嵥,����
		����ֵ: ��
		����: ����
	*/
	public static void printStore(String[] brand, double[] size, double[] price, int[] count){
		System.out.println("------------�̳�����嵥------------");
		System.out.println("Ʒ���ͺ�      �ߴ�     �۸�     �����");
		//�������,�����ܿ����,���ܼ۸�
		int totalCount = 0;
		int totalMoney = 0;
		
		//��������,��ӡ������Ʒ��Ϣ
		for(int i = 0; i < brand.length; i++){
			System.out.println(brand[i]+"    "+size[i]+"     "+price[i]+"    "+count[i]);
			totalCount += count[i];
			totalMoney += count[i]*price[i];
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("�ܿ����: "+totalMoney);
	}
	
	
	/*
		���巽��,ʵ���û���ѡ����
		����ֵ: int
		����:  û��
	*/
	public static int chooseFunction(){
		System.out.println("----------------------------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸Ŀ������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ������");
		//���ܼ�������
		Scanner sc = new Scanner(System.in);
		int chooseNumber = sc.nextInt();
		return chooseNumber;
	}
}