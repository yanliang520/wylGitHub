package Neibulei;
/**
 * �ֲ��ڲ���
 * @author yanliang
 *
 */
public class Jubu {//�ⲿ��
	private int a=100;
	int b=1;
	
	//�ⲿ�෽��
	public void Waibuf(final int k) {
		System.out.println(k);
		
		final int a=66;
		int j=50;
		
		class Neibu{//�������洴���ڲ���
			//static int b=2; �ֲ��ڲ����в��ɶ��徲̬����
			int b=2;
			
			public void Neibuf() {//�ڲ���ķ���
				//Waibuf(6);//���ܷ����ⲿ���Waibuf��int k������
				System.out.println("�ڲ����final������"+a);// ����ڲ����������ⲿ��ͬ���ı�����ֱ���ñ��������ʵ����ڲ���ı���
				System.out.println("�ⲿ�෽����final������"+k);
				System.out.println("�ⲿ���private������"+Jubu.this.a);
			}
			
			Neibu(){//�ڲ���Ĺ��췽��
				Neibuf();
			}
		}
		new Neibu();//�����д����ڲ���Ķ���
	}
	
	public static void main(String[] args) {
		//Neibuf n = new Neibuf(); ����ֱ�����ɾֲ��ڲ���
		Jubu j= new Jubu();
		j.Waibuf(9);
	}
}
