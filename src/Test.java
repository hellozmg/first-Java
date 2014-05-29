
public class Test {
	String name;     //姓名
	
	
	public static void main(String[] args){
	Test zs=new Test();
	Test ls=new Test();
	
	zs.name="张三";
	ls.name="李四";

	
	zs.eat("鸡蛋");
	ls.eat("青菜");
	
	zs.sleep("大床");
	ls.sleep("铁床");
	
	zs.drive("宝马");
	ls.drive("奔驰");
	
	
	
	}
	 void eat(String food) {
	System.out.println(name+"   正在吃    "+food+"!");
	
		
	}
	 void sleep(String chuang){
		 System.out.println(name+" 正在睡    "+chuang+"!");
	 }
	 
	 void drive(String che){
		 
		 System.out.println(name+"在开"+che);
	 }
 

}
