package Neibulei;
/**
 * ��Ա�ڲ���
 * @author yanliang
 *
 */
public class ChengYuan {//�ⲿ��
	private static int i=1;
	private int j=10;
	private int k=20;
	public static void Waibuf() {
		System.out.println("�����ⲿ��ķ���������");
	}
	
	public class Neibu {//�����ڲ���
		private static final int i=2;
		int j =100;
		int k=666;
		
		void Neibuf() {
			//�ڲ�������ⲿ��ͬ�������á��ⲿ����.this.��������
			System.out.println("�����ⲿ��ı�����"+ChengYuan.this.i);
			System.out.println("�����ڲ����final������"+this.i);
			//ֱ�ӷ����ⲿ��ķ���
			Waibuf();
		}
	}
	
	//����������ȡ�ڲ���
	public Neibu getNei() {
		return new Neibu();
	}
	//�ⲿ��ķǾ�̬���������ڲ���
	public void WaibufN() {
		//�����ڲ���Ķ���
		Neibu n = new Neibu();
		n.Neibuf();//�����ڲ���ķ���
	}
	
	//�ⲿ��ľ�̬���������ڲ���,����ֱ�Ӵ����ڲ�����󣡣���
	public static void Waibufs() {
		ChengYuan c=new ChengYuan();
		Neibu neibu=c.getNei();//��������ȡ�ڲ������
		//Neibu n=c.new Neibu();//��ͨ���ⲿ��.new �ڲ���
		neibu.Neibuf();//�����ڲ���ķ���
	}
	
	public static void main(String[] args) {
		ChengYuan c=new ChengYuan();
		//c.WaibufN();
		Waibufs(); 
	}
}
