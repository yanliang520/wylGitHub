package Yichang;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println(Exception1.method());
	}
	
	public static int method(){
        try {
            return 1;
        } catch (Exception e) {
            return 0;
        } finally {
            return 2;
        }
    }
}
