/*
	选择语句 switch语句
	和if条件语句不同,只能针对某个表达式的值作出判断
	编写格式:
		switch(表达式){
			case 常量1: 
				要执行的语句;
			break;
			
			case 常量2: 
				要执行的语句;
			break;
			
			default:
				要执行的语句;
			break;
		}
		执行流程:表达式,和case后面的常量进行比较
		和哪个case后的常量相同,就执行哪个case后面的程序,遇到break,就全结束
		如果没有找到任何匹配值,就执行default后的语句
		switch语句中表达式的数据类型,是有要求的
		JDK1.0-1.4 数据类型接受 byte short int char
		JDK1.5	   数据类型接受 byte short int char enum(枚举)
		JDK1.7 	   数据类型接受 byte short int char enum String
		如果case条件后面的执行语句一样,则执行语句只需写一次即可
*/
public class SwitchDemo{
	public static void main(String[] args){
		//定义变量,保存星期几的整数
		int week = 8;
		//switch语句
		switch(week){
			case 1:
			System.out.println("星期1");
			break;
			
			case 2:
			System.out.println("星期2");
			break;
			
			case 3:
			System.out.println("星期3");
			break;
			
			case 4:
			System.out.println("星期4");
			break;
			
			case 5:
			System.out.println("星期5");
			break;
			
			case 6:
			System.out.println("星期6");
			break;
			
			case 7:
			System.out.println("星期日");
			break;
			
			default:
				System.out.println("不存在");
			break;
		}
	}
}