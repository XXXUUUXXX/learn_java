/*
	���������е����ֵ
	���� {4,1,6,5};���Ƚ�
*/
public class ArrayDemo_5{
	public static void main(String[] args){
		//��������,int����
		int[] arr = {1,4,6,7,9,2,5};
		//�������,��¼������0�����ϵ�Ԫ��
		int max = arr[0];
		
		//��������,��ȡ���е�Ԫ��,�ͱ���max�Ƚ�
		for(int i = 1; i < arr.length; i++){
			//����max��������ÿ��Ԫ�ؽ��бȽ�
			if(max < arr[i]){
				//�ϴ������Ԫ�ظ�ֵ��max
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}