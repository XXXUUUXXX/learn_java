/*
	if...else����ʽ
	��д��ʽ
	if(����){
		if��ִ����
	}else{
		else��ִ����
	}
	��if�е�����Ϊtrue,ִ��if��ִ����
	��if�е�����Ϊfalse,ִ��else��ִ����
*/

public class IfElseDemo{
	public static void main(String[] args){
		int i = 17;
		//�жϱ���,����ż��
		if(i % 2 == 0){
			System.out.println(i+"Ϊż��");
		}else{
			System.out.println(i+"Ϊ����");
		}
	}
}