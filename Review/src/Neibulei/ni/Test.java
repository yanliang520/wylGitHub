package Neibulei.ni;

public class Test {
	public static void main(String[] args) {
		new NimClass().test(new InterTest() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类使用。。");
			}
		});
	}
}
