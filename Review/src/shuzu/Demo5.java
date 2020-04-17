package shuzu;

public class Demo5 {
	public static void main(String[] args) {
		int a[]={1,6,56,9,8,78,123,6,5656,-456,0};
		int ma=a[0];
		int mi=a[0];
		for (int i = 0; i < a.length; i++) {
			if (ma>a[i]) {
				ma=a[i];
			}if (mi<a[i]) {
				mi=a[i];
			}
		}
		System.out.println(ma+"======"+mi);
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int d;
				if (a[i]<a[j]) {
					d=a[i];
					a[i]=a[j];
					a[j]=d;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
