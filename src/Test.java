
public class Test {
	String name;     //����
	
	
	public static void main(String[] args){
	Test zs=new Test();
	Test ls=new Test();
	
	zs.name="����";
	ls.name="����";

	
	zs.eat("����");
	zs.sleep("��");
	
	ls.eat("���");
	ls.sleep("����");

	
	}
	 void eat(String food) {
	System.out.println(name+"   ���ڳ�    "+food+"!");
		
	}
	 void sleep(String chuang){
		 System.out.println(name+" ����˯    "+chuang+"!");
	 }
 

}
