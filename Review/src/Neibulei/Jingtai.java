package Neibulei;
/**
 * ��̬�ڲ���
 * @author yanliang
 *
 */
public class Jingtai {
	private static int i=1;
	private  int j=10;
	private static void Waibuf() {
		System.out.println("�ⲿ���static����");
	}
	public void Waibu() {
		System.out.println("�ⲿ��ķ���");
	}
	
	static class Neibu{//������̬�ڲ���
		static int i=2;
		int j=20;
		private  String name="admin";
		
		static void Neibuf() {
			System.out.println("�����ⲿ��ľ�̬������"+Jingtai.i);
			System.out.println("�ڲ���ľ�̬����"+i);
			//System.out.println("�ڲ���ľ�̬����"+j);���ܷ��ʷǾ�̬�����򷽷�
			//System.out.println("�ڲ����private��̬������"+name);
			Jingtai.Waibuf();
		}
		 void Neibuf2(){
				//   System.out.println("Outer.i"+j);//��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա
				//   outer_f2();//�����Ǿ�̬�����ͷǾ�̬����
					 System.out.println("��̬�����ͨ����");
			}
	}
	
	//�ⲿ����ʾ�̬���Ա
	public void Waibuf2() {
		System.out.println("�ⲿ������ڲ������i��"+Neibu.i);
		//System.out.println("�ڲ����private��̬������"+Neibu.name);
		Neibu.Neibuf();
		//�����ڲ���Ǿ�̬����Ҫʵ�����ڲ������
		Neibu n= new Neibu();
		n.Neibuf2();
		System.out.println("�ڲ����private��̬������"+n.name);
		
	}
	
	public static void main(String[] args) {
		//ע�⣺*******���ɣ�new��һ����̬�ڲ��಻��Ҫ�ⲿ���Ա
		//Neibu.Neibuf();
		new Jingtai().Waibuf2();
	}
}
