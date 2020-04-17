package Neibulei;
/**
 * 匿名内部类
 * @author 11976
 * 匿名内部类 
        就是内部类简化写法 
         
    前提:存在一个类或者接口 
         这里的类可以是具体也可以是抽象类 
     
    格式: 
        new 类名或者接口(){ 
            方法重写; 
        } 
         
    本质是什么呢? 
        是一个继承了该类或者实现了该接口的子类匿名对象
        
       　	   a·匿名内部类不能有构造方法。
　　　　　　b·匿名内部类不能定义任何静态成员、方法和类。
　　　　　　c·匿名内部类不能是public,protected,private,static。
　　　　　　d·只能创建匿名内部类的一个实例。
　　　　　　e·一个匿名内部类一定是在new的后面，用其隐含实现一个接口或实现一个类。
　　　　　　f·因匿名内部类为局部内部类，所以局部内部类的所有限制都对其生效。
 */
public interface Niming {
	void show();
}
//class NeibuN{
//	public void test() {
//		new Niming() {
//			
//			@Override
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("内部类实现接口的方法");
//			}
//		}.show();
//	}
//}
