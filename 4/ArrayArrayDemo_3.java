/*
	二维数组 遍历求和
	求和:
	每个小组求和
	所有元素求和
*/
public class ArrayArrayDemo_3{
	public static void main(String[] args){
		int[][] arr = {{11,12},{21,22,23},{31,32,33,34}};
		int sum = 0;//所有元素求和
		int groupSum = 0;//一维数组求和
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