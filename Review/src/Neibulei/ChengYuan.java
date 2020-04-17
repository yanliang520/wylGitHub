package Neibulei;
/**
 * 成员内部类
 * @author yanliang
 *
 */
public class ChengYuan {//外部类
	private static int i=1;
	private int j=10;
	private int k=20;
	public static void Waibuf() {
		System.out.println("这是外部类的方法。。。");
	}
	
	public class Neibu {//创建内部类
		private static final int i=2;
		int j =100;
		int k=666;
		
		void Neibuf() {
			//内部类访问外部类同名变量用‘外部类名.this.变量名’
			System.out.println("这是外部类的变量："+ChengYuan.this.i);
			System.out.println("这是内部类的final变量："+this.i);
			//直接访问外部类的方法
			Waibuf();
		}
	}
	
	//创建方法获取内部类
	public Neibu getNei() {
		return new Neibu();
	}
	//外部类的非静态方法访问内部类
	public void WaibufN() {
		//创建内部类的对象
		Neibu n = new Neibu();
		n.Neibuf();//访问内部类的方法
	}
	
	//外部类的静态方法访问内部类,不能直接创建内部类对象！！！
	public static void Waibufs() {
		ChengYuan c=new ChengYuan();
		Neibu neibu=c.getNei();//调方法获取内部类对象
		//Neibu n=c.new Neibu();//可通过外部类.new 内部类
		neibu.Neibuf();//调用内部类的方法
	}
	
	public static void main(String[] args) {
		ChengYuan c=new ChengYuan();
		//c.WaibufN();
		Waibufs(); 
	}
}
