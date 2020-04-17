package shuzu;

public class Demo4 {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= new int[a.length-1];
		for (int i = 0; i < a.length; i++) {
			if (i<1) {
				b[i]=a[i];
			}else if(i>1){
				b[i-1]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
