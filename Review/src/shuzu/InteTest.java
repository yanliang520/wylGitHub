package shuzu;

public class InteTest implements Inte{

	@Override
	public void Ceshi() {
		// TODO Auto-generated method stub
		System.out.println("ʵ��Inte�ӿ�Ceshi����");
	}
	public static void main(String[] args) {
		InteTest i = new InteTest();
		i.Ceshi();
		System.out.println(i.a);
	}
}
