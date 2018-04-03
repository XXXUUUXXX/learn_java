/*
	测试:刚定义好的Phone类
	创建引用类型变量的格式
		数据类型 变量名 = new 数据类型();
	实现引用类型的步骤:
		1.导入包 类在同一个文件夹不需要导入包
		2.创建引用类型的变量
		3.变量.类型中的功能
*/
public class TestPhone{
	public static void main(String[] args){
		//创建应用类型的变量
		Phone p = new Phone();
		//System.out.println(p);
		//变量.类型中的功能
		//变量 p.方式,调用类中的属性
		//属性就是变量
		p.color = "gold tuhao";
		p.brand = "apple";
		p.size = 15.0;
		
		//获取属性值
		System.out.println(p.color+"    "+p.brand+"    "+p.size+"     ");
	}
}