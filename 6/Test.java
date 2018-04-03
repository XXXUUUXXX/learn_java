/*
	测试类:测试电饭锅,汽车,学生
*/
public class Test{
	public static void main(String[] args){
		//创建电饭锅引用类型
		DianFanGuo dfg = new DianFanGuo();
		dfg.brand = "特斯拉";
		dfg.color = "白色";
		dfg.size = 15.8;
		
		System.out.println(dfg.brand+"    "+dfg.size+"     "+dfg.color);
	}
}