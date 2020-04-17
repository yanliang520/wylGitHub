package Neibulei;

public class Test {
	public static void main(String[] args) {
		//匿名内部类测试
		new NeibuN().test();
		
		new NimingABIMP().test(new NimingAB() {
			
			@Override
			public int fly() {
				// TODO Auto-generated method stub
				return 100;
			}
			
			public String getName() {
		        return "测试";
		    }
		});
	}
}
