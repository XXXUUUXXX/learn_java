/*
	数组操作中,常见的两个异常
	数组的索引越界异常
	空指针异常
*/
public class ArrayDemo_4{
	public static void main(String[] args){
		//数组的索引越界异常
		//int[] arr = {1,3,5};
		//数组中三个元素,索引012
		//System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
		
		//空指针异常
		int[] arr2 = {1,2,3};
		System.out.println(arr2[2]);
		arr2 = null; //arr2不再保存数组的地址
		System.out.println(arr2[2]);//java.lang.NullPointerException
		
	}
}