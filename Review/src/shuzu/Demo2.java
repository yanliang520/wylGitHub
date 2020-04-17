package shuzu;

public class Demo2 {
	public static void main(String[] args) {
		int a[]= {1,34,6};
		int b[]= {2,6,79};
		int c[] = new int[a.length+b.length];
		for (int i = 0; i < c.length; i++) {
			if (i<a.length) {
				c[i]=a[i];
			}else {
				c[i]=b[i-a.length];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
