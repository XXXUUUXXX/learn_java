/*
	if else if else语句
	适合在程序中,实现多条件的判断
	编写格式:
	  if(条件1){
		  if执行体1
	  }else if(条件2){
		  if执行体2
	  }else{
		  else执行体
	  }
	  一个语句中,包含多个if,只要1个if的条件是true,其他代码不再执行
	  
*/

public class IfElseIfDemo{
	public static void main(String[] args){
		//成绩判断要求,成绩>80 成绩>70 成绩>60 不及格
		//定义变量,保存成绩
		int grade = 75;
		if(grade > 80){
			System.out.println("优秀");
		}else if(grade > 70){
			System.out.println("良好");
		}else if(grade > 60){
			System.out.println("合格");
		}else{
			System.out.println("不及格");
		}
	}
}