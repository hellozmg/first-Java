
public class Test {
	String name;     //����
	
	
	public static void main(String[] args){
	Test zs=new Test();
	Test ls=new Test();
	
	zs.name="����";
	ls.name="����";

	
	zs.eat("����");
	ls.eat("���");
	
	zs.sleep("��");
	ls.sleep("����");
	
	zs.drive("����");
	ls.drive("����");
	
	
	
	}
	 void eat(String food) {
	System.out.println(name+"   ���ڳ�    "+food+"!");
	
		
	}
	 void sleep(String chuang){
		 System.out.println(name+" ����˯    "+chuang+"!");
	 }
	 
	 void drive(String che){
		 
		 System.out.println(name+"�ڿ�"+che);
	 }
 

}
