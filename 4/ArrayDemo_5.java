/*
	计算数组中的最大值
	数组 {4,1,6,5};作比较
*/
public class ArrayDemo_5{
	public static void main(String[] args){
		//定义数组,int类型
		int[] arr = {1,4,6,7,9,2,5};
		//定义变量,记录数组中0索引上的元素
		int max = arr[0];
		
		//遍历数组,获取所有的元素,和变量max比较
		for(int i = 1; i < arr.length; i++){
			//变量max和数组中每个元素进行比较
			if(max < arr[i]){
				//较大的数组元素赋值给max
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}