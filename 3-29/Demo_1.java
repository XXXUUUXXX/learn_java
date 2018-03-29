/*
    Demo_1类，演示java中的所有类型的常量
    程序输出：
    整数常量
    小数常量
    布尔常量
    字符常量
    字符串常量
*/
public class Demo_1{
    public static void main(String[] args){
        //输出整数，十进制
        System.out.println(50);
		
        //输出整数，二进制，数字开头0B
        System.out.println(0B11);
		
		//输出整数，八进制，数字开头0
		System.out.println(051);
		
		//输出整数，十六进制，数组开头0X
		System.out.println(0XE);
		
		//输出浮点数
		System.out.println(5.5);
		
		//输出布尔数据，true，false
		System.out.println(true);
		System.out.println(false);
		
		//输出字符常量，单引号包裹，只能写一个字符
		System.out.println('a');
		System.out.println('好');
		
		//输出字符串常量，双引号包裹,可以写n个字符
		System.out.println("哈哈哈");

    }
}