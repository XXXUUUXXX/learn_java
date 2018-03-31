/*
	逻辑运算符,对两个boolean类型数据之间进行计算
	结果也是boolean类型
	& 与
	| 或
	^ 异或 两边相同为false,不同为true
	! 非
	&& : 短路与 , 一边是false,另一边不运行
	|| : 短路或 , 一边是true,另一边不运行
*/

public class Operator_4{
	public static void main(String[] args){
		System.out.println( false & true );
		System.out.println( true | true );
		System.out.println( false ^ false );//F
		System.out.println( true ^ false );//T
		System.out.println( true ^ true );//F 
		
		
		System.out.println( !true );
		System.out.println( "--------------------------" );
		int i = 3;
		int j = 4;
		System.out.println(3>4 && ++j>2);
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(3==3 || ++j>2);
		System.out.println(i);
		System.out.println(j);
	}
}