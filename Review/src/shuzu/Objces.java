package shuzu;

public class Objces {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("str1==str2�ıȽϽ����"+(str1 == str2));
		System.out.println("str1.equals(str2))�ıȽϽ����"+(str1.equals(str2)));
		System.out.println("str3==str4�ıȽϽ����"+(str3 == str4));
		System.out.println("str3.equals(str4))�ıȽϽ����"+(str3.equals(str4)));
		
		System.out.println(Objces.test(5));
		System.out.println(5*4*3*2*1);
	}
	
	public static int test(int n) {
		if (n==1||n==0) {
			return 1;
		}else {
			return n*test(n-1);
		}
	}
}
