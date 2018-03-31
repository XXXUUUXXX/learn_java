/*
	实现猜数字游戏
	 随机数一个数字,让用户猜
	 三种情况:
	 猜对,大了,小了
	随机数:Random
	键盘输入:Scanner
	猜的数字和随机数比较:if判断
	直到猜中为止:while循环
*/
import java.util.Random;
import java.util.Scanner;
public class GuestNumber{
	public static void main(String[] args){
		System.out.println("请输入1-10之间的数字");
		//创建Scanner类变量
		Scanner sc = new Scanner(System.in);
		
		//创建Random类变量
		Random ran = new Random();
		//变量.使用功能nextInt()获取随机数1-10
		int ranNumber = ran.nextInt(10)+1;
		
		while(true){
			//获取键盘输入
			int number = sc.nextInt();
			if(number > ranNumber){
				System.out.println("猜大了");
			}else if(number < ranNumber){
				System.out.println("猜小了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}
	}
}