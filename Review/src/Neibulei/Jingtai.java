package Neibulei;
/**
 * 静态内部类
 * @author yanliang
 *
 */
public class Jingtai {
	private static int i=1;
	private  int j=10;
	private static void Waibuf() {
		System.out.println("外部类的static方法");
	}
	public void Waibu() {
		System.out.println("外部类的方法");
	}
	
	static class Neibu{//创建静态内部类
		static int i=2;
		int j=20;
		private  String name="admin";
		
		static void Neibuf() {
			System.out.println("访问外部类的静态变量："+Jingtai.i);
			System.out.println("内部类的静态变量"+i);
			//System.out.println("内部类的静态变量"+j);不能访问非静态变量或方法
			//System.out.println("内部类的private静态变量："+name);
			Jingtai.Waibuf();
		}
		 void Neibuf2(){
				//   System.out.println("Outer.i"+j);//静态内部类不能访问外部类的非静态成员
				//   outer_f2();//包括非静态变量和非静态方法
					 System.out.println("静态类的普通方法");
			}
	}
	
	//外部类访问静态类成员
	public void Waibuf2() {
		System.out.println("外部类访问内部类变量i："+Neibu.i);
		//System.out.println("内部类的private静态变量："+Neibu.name);
		Neibu.Neibuf();
		//访问内部类非静态方法要实例化内部类对象
		Neibu n= new Neibu();
		n.Neibuf2();
		System.out.println("内部类的private静态变量："+n.name);
		
	}
	
	public static void main(String[] args) {
		//注意：*******生成（new）一个静态内部类不需要外部类成员
		//Neibu.Neibuf();
		new Jingtai().Waibuf2();
	}
}
