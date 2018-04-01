/*
	int[][] arr  = new int[3][]; 不推荐
	二维数组中定义三个一维数组,每个一维数组长度没有指定
	arr[0]
	arr[1]
	arr[2]
	必须要new
		arr[0] = new int[5];
		arr[1] = new int[4];
		arr[2] = new int[3];
	最简单的二维数组定义方式:
	int[][] arr = {{},{},{}};
*/
public class ArrayArrayDemo_1{
	public static void main(String[] args){
		int[][] arr = {{1,2},{3},{4,5,6},{7,8,9}};
		
		//问题:打印7
		System.out.println(arr[3][0]);
	}
}