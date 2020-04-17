package Neibulei;

public class NeibuN {
	public  void test() {
		new Niming() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("内部类实现接口的方法");
			}
		}.show();
	}
}
