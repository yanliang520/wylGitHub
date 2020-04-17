package shuzu;

import java.util.Scanner;

public class YangHui {
	public static void main(String[] args) {
		YangHui.Yang();
	}
	
	public static void Yang() {
		Scanner scan=new Scanner(System.in);
		int num=0;
		System.out.println("请输入显示杨辉三角形的行数：");
		num=scan.nextInt();
		int [][] nums=new int[num][num];
		System.out.println(nums.length);
		for (int i = 0; i < nums.length; i++) {
			nums[i][0]=1;
			for (int j = 1; j < (i+1); j++) {// j=1  从每一行的第二列开始
				System.out.print("i="+i+"  j="+j+"    ");
				nums[i][j]=nums[i-1][j-1]+nums[i-1][j];
				System.out.print("nums[i][j]"+"====="+nums[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j]==0) {
					break;
				}
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		scan.close();
	}
}
