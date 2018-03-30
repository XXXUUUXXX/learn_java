/*
	赋值运算符
	=
	+= -+ *= /+ %=
*/

public class Operator_2{
	public static void main(String[] args){
		// = 赋值运算,将后面的值赋值给左边的变量
		int i = 3;
		i = i + 3;
		System.out.println(i);
		
		// += 赋值运算符 i+=3 i=i+3
		int j = 5;
		j += 5;
		System.out.println(j);
		
		byte b = 1;
		b = (byte)(b + 1);
		System.out.println(b);
		
		byte b1 = 1;
		b1 += 1;//相当于b1 = (byte)(b+1)
		System.out.println(b1);
	}
}