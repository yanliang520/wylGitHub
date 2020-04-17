package shuzu;

public class Objces {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("str1==str2的比较结果："+(str1 == str2));
		System.out.println("str1.equals(str2))的比较结果："+(str1.equals(str2)));
		System.out.println("str3==str4的比较结果："+(str3 == str4));
		System.out.println("str3.equals(str4))的比较结果："+(str3.equals(str4)));
		
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
