package shuzu;

public class Demo3 {
	public static void main(String[] args) {
		int[] a= {1,2,5};
		int[] b = new int[a.length+1];
		for (int i = 0; i < b.length; i++) {
			if (i<1) {
				b[i]=a[i];
			}else if(i==1) {
				b[i]=3;
			}else {
				b[i]=a[i-1];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
