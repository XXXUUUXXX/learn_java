/*
	循环语句:可以让一部分代码,反复执行
	while循环:
		格式:
			while(条件){
				循环体
			}
			当条件是true,就执行循环体,执行完循环体后,
			再次执行while中的条件,若条件还是true继续执行循环体,
			直到条件为false,循环结束
*/
public class WhileDemo{
	public static void main(String[] args){
		//输出 1-4之间的整数
		//定义变量,整数类型,循环条件
		int i = 1;
		while(i < 5){
			System.out.println(i);
			i++;
		}
	}
}