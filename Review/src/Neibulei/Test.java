package Neibulei;

public class Test {
	public static void main(String[] args) {
		//�����ڲ������
		new NeibuN().test();
		
		new NimingABIMP().test(new NimingAB() {
			
			@Override
			public int fly() {
				// TODO Auto-generated method stub
				return 100;
			}
			
			public String getName() {
		        return "����";
		    }
		});
	}
}
