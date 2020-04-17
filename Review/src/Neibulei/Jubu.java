package Neibulei;
/**
 * 局部内部类
 * @author yanliang
 *
 */
public class Jubu {//外部类
	private int a=100;
	int b=1;
	
	//外部类方法
	public void Waibuf(final int k) {
		System.out.println(k);
		
		final int a=66;
		int j=50;
		
		class Neibu{//方法里面创建内部类
			//static int b=2; 局部内部类中不可定义静态变量
			int b=2;
			
			public void Neibuf() {//内部类的方法
				//Waibuf(6);//不能访问外部类的Waibuf（int k）方法
				System.out.println("内部类的final变量："+a);// 如果内部类中有与外部类同名的变量，直接用变量名访问的是内部类的变量
				System.out.println("外部类方法的final变量："+k);
				System.out.println("外部类的private变量："+Jubu.this.a);
			}
			
			Neibu(){//内部类的构造方法
				Neibuf();
			}
		}
		new Neibu();//方法中创建内部类的对象
	}
	
	public static void main(String[] args) {
		//Neibuf n = new Neibuf(); 不可直接生成局部内部类
		Jubu j= new Jubu();
		j.Waibuf(9);
	}
}
