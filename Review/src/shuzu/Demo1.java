package shuzu;

public class Demo1 {
	public static void main(String[] args) {
		String[] str = {"ÎÒÏ²»¶","Äã","Ãô"};
		String[] sys = new String[str.length];
		for (int i = 0; i < sys.length; i++) {
			sys[sys.length-1-i]=str[i];
		}
		for (int i = 0; i < sys.length; i++) {
			System.out.print(sys[i]);
		}
	}
}
