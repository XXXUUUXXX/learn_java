/*
	测试手机类
	  创建2个手机类的变量
*/
public class TestPhone_1{
	public static void main(String[] args){
		//创建手机类型变量
		Phone p1 = new Phone();
		
		//再次创建手机类型变量
		Phone p2 = new Phone();
		
		p1.color = "white";
		p1.brand = "xiaomi";
		p1.size = 5.5;
		
		p2.brand = "huawei";
		System.out.println(p1.brand);
		System.out.println(p2.brand);
	}
}