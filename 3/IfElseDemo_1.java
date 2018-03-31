/*
	if语句和三元运算符的替换
	
	已经知道两个数,计算最大值
	使用if还是三元
	判断条件多,使用if
	三元必须有结果,if可以没有结果
*/

public class IfElseDemo_1{
	public static void main(String[] args){
		int i = 7;
		int j = 5;
		//使用if语句判断最大值
		if(i>j){
			System.out.println(i+"是最大值");
		}else{
			System.out.println(j+"是最大值");
		}
		//使用三元运算符实现
		int k = i>j ? i : j;
		System.out.println(k+"是最大值");
	}
}