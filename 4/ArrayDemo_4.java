/*
	���������,�����������쳣
	���������Խ���쳣
	��ָ���쳣
*/
public class ArrayDemo_4{
	public static void main(String[] args){
		//���������Խ���쳣
		//int[] arr = {1,3,5};
		//����������Ԫ��,����012
		//System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
		
		//��ָ���쳣
		int[] arr2 = {1,2,3};
		System.out.println(arr2[2]);
		arr2 = null; //arr2���ٱ�������ĵ�ַ
		System.out.println(arr2[2]);//java.lang.NullPointerException
		
	}
}