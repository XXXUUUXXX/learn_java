/*
	++ 写在变量前面,和写在变量后面,区别
	a = 1
	a++  ++a
	符号写在前面,还是后面,在变量自己独立计算的时候,没有区别
	
	但是变量,要是参与了其他运算,就有区别
	j = i++ ++后算,先将i的值,赋值给j,i自己再++
	n = ++m ++先算,变量m++ 6,变量赋值给n
*/

public class Operator_1{
	public static void main(String[] args){
		int i = 5;
		int j = i++;
		System.out.println(i);//6
		System.out.println(j);//5
		
		int m = 5;
		int n = ++m;
		System.out.println(m);//6
		System.out.println(n);//6
		
		int a = 3;
		int b;
		b = a++ + 10;
		System.out.println(a);//4
		System.out.println(b);//13
	}
}