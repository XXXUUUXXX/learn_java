/*
	引用数据类型,类 Scanner
	可以直接使用的类
	定义引用数据类型变量,和基本类型变量区别
	int a = 1;
	格式:
		类型 变量名 = new 类型();
	例如:创建出Scanner类的变量
		Scanner sc = new Scanner();
	每个引用类型,都有自己的功能
	使用功能,公式:
		变量名.方法名();
	Scanner类,作用:在命令行接受键盘的输入
	使用Scanner类步骤:
		1.导入包,指明类所在的文件夹,import java.util.Scanner;
		  java文件夹-util文件夹
		2.公式,创建出Scanner类型变量
		3.变量.使用Scanner类中的功能,完成键盘输入
*/
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		//类型 变量名 = new 类型();
		//创建出Scanner,类变量
		Scanner sc = new Scanner(System.in);
		//变量.方法名();  接收键盘输入
		//方法:nextInt() 接收键盘输入,保证输入的是整数
		//方法接受的数据就是整数,方法运行后的结果就是整数类型
		int i = sc.nextInt();
		System.out.println(i+1);
		
		//Scanner类的另一个功能  next()接收键盘输入的字符串
		String s = sc.next();
		System.out.println(s);
	}
}