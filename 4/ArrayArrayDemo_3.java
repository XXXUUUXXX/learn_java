/*
	��ά���� �������
	���:
	ÿ��С�����
	����Ԫ�����
*/
public class ArrayArrayDemo_3{
	public static void main(String[] args){
		int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};
		int sum = 0;//����Ԫ�����
		int groupSum = 0;//һά�������
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				groupSum +=arr[i][j];
			}
			System.out.println(groupSum);
			sum += groupSum;
		}
		System.out.println(sum);
	}
}