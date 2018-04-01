/*
	switch特性:case 穿透性
	案例:星期1-5,输出,工作日,星期6-7,输出,休息日
	case后面的常量和switch中数据相同,没有break,就一直向下穿透
	case后面没有break,程序就会一直向下穿透
*/
public class SwitchDemo_1{
	public static void main(String[] args){
		int week = 1;
		switch(week){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("工作日");
			break;
			
			case 6:
			case 7:
				System.out.println("休息日");
			break;
		}
	}
}