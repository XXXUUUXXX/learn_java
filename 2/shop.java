/*
	实现商品库存清单案例
		步骤:
		1.实现表头,是固定数据,直接写输出语句sop
		2.表格中间,商品数据,采用变量形式定义变量,找对数据类型,输出所有变量
		3.表格底部,一部分数据固定
		
*/
public class shop{
	public static void main(String[] args){
		//输出表头固定数据
		System.out.println("------------商场库存清单------------");
		System.out.println("品牌型号      尺寸     价格     库存数");
		//定义表格中的数据变量
		//品牌型号,String,尺寸价格,double,库存,int
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		int macCount = 5;
		
		String thinkBrand = "ThinkPad";
		double thinkSize = 14;
		double thinkPrice = 5999.99;
		int thinkCount = 10;
		
		String asusBrand = "ASUS-FL5800";
		double asusSize = 15.6;
		double asusPrice = 4999.5;
		int asusCount = 18;
		//商品信息变量进行打印,变量之间加入一定的字符串空格
		System.out.println(macBrand+"    "+macSize+"     "+macPrice+"    "+macCount);
		System.out.println(thinkBrand+"      "+thinkSize+"     "+thinkPrice+"    "+thinkCount);
		System.out.println(asusBrand+"   "+asusSize+"     "+asusPrice+"     "+asusCount);
		//计算库存总数,所有商品数量库存求和
		int totalCount = macCount+thinkCount+asusCount;
		//计算所有商品库存的总金额,每个商品价格*库存数
		double totalMoney = macCount*macPrice + thinkCount*thinkPrice + asusCount*asusPrice;
		//输出表格底部
		System.out.println("总库存数: "+totalCount);
		System.out.println("总库存金额: "+totalMoney);
		
		
	}
	
}