/*
	�����Ķ�����ϰ:
	
*/
import java.util.Scanner;
public class MethodDemo_1{
	public static void main(String[] args){
		//printReact();
		
		//int number = getNumber();
		//System.out.println(number);
		
		//printReact_1(3,5);
		
		int aver = average(3,4,5);
		System.out.println(aver);
	}
	
	/*
		�����޷���ֵ,�޲�������,���ӡ3��,ÿ��3��*�ŵľ���
		Ϊʲôû�з���ֵ:
		��ӡ����,���Ч��,����Ҫ���������
		��ȷδ֪��:����Ҫδ֪��
						 
	*/
	public static void printReact(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
		�����з���ֵ,�޲�������,�����¼��õ�һ������
		��ȷ���������������������: int
		��ȷ��û��δ֪��
	*/
	public static int getNumber(){
		Scanner sc = new Scanner(System.in);
		//int number = sc.nextInt();
		return sc.nextInt();
	}
	
	/*
		�����޷���ֵ,�в�������,���ӡָ��M��,ÿ��N��*�ŵľ���
		��ȷ�����������,����̨���ͼ��,û�з���ֵ
		������û��δ֪��,ͼ������,������δ֪��,�������� int
	*/
	public static void printReact_1(int M,int N){
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
		�����з���ֵ�в�������,������������ƽ��ֵ
		��ȷ������������������,����ֵ����int
		��ȷ����δ֪��,����δ֪������
	*/
	public static int average(int a,int b,int c){
		return (a + b + c) / 3;
	}
}