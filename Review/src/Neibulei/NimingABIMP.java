package Neibulei;

public class NimingABIMP {
	// 匿名内部类本质上是一个重写或实现了父类或接口的子类对象
	//当类或接口类型作为参数传递时，可以直接使用匿名内部类方式创建对应的对象
	public void test(NimingAB n) {
		System.out.println(n.getName()+"-抽象类中属性："+n.fly());
	}
}
