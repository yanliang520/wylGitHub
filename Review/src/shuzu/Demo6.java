package shuzu;

public class Demo6 {
	public static void main(String[] args) {
		//�����м�ȥ����Ԫ��
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] b = new int[a.length - 2];
		for (int i = 0; i < a.length; i++) {
			if (i < 2) {
				b[i] = a[i];
			} else if (i > 2) {
				b[i - 2] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			//System.out.print(b[i]);
		}	
		
		//���������ݷ�ת
		String str[]={"��","Ȼ","��","ɪ","��"};
		String []strs=new String[str.length];
		for (int i = 0; i < str.length; i++) {
			System.out.println(strs.length-1-i+"i="+i);
			strs[strs.length-1-i]=str[i];//�����д����һ��ֵ��ʼ �±�ݼ���ֵ���θ���ǰ����
		}
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
	}
}
