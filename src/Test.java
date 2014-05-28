
public class Test {
	String name;     //姓名
	
	
	public static void main(String[] args){
	Test zs=new Test();
	Test ls=new Test();
	
	zs.name="张三";
	ls.name="李四";

	
	zs.eat("鸡蛋");
	zs.sleep("大床");
	
	ls.eat("青菜");
	ls.sleep("铁床");

	
	}
	 void eat(String food) {
	System.out.println(name+"   正在吃    "+food+"!");
		
	}
	 void sleep(String chuang){
		 System.out.println(name+" 正在睡    "+chuang+"!");
	 }
 

}
