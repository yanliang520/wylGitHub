package file.seach;

import java.io.File;
import java.util.Scanner;

/**
 * 查找文件
 * @author yanliang
 *
 */
public class FileManager {
public static String filePath = "";//当前步骤所在的路径
	
	/**
	 * 显示根目录
	 */
	public static void showRoots(){
		//获取根目录所有File对象
		File[] files = File.listRoots();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
	
	
	/**
	 * 获取当前路径所在的文件对象
	 * @param name 输入的文件名
	 */
	public static File getFile(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件或文件夹名：");
		String name=scanner.nextLine();
		File file = null;//定义一个File对象的引用，用来接收当前的file对象
		if ("b".equalsIgnoreCase(name)) {//如果输入的是back
			file = new File(FileManager.filePath);
			file = file.getParentFile();//获取上一级路径
			if (file != null) {
				FileManager.filePath = file.getPath();//获取上一级路径
			} else {
				FileManager.filePath = "";//回到根目录
				System.out.println("已经到了根目，不能再回退了！");
				//如果文件不存在，显示根路径
				FileManager.showRoots();
			}
		} else if ("c".equalsIgnoreCase(name)) {
			System.out.println("程序结束！");
			System.exit(0);
		} else {
			if ("".equals(FileManager.filePath)) {//如果为空，证明为根目录，直接得到文件对象
				file = new File(name+":"+File.separator);
				if (file.exists()) {
					//将根目录赋值当前路径
					FileManager.filePath = file.getPath();
				} else {
					System.out.println("输入的根路径错误，请重新输入！");
					//如果文件不存在，显示根路径
					FileManager.showRoots();
				}
			} else {
				//否则不是根目录，拿当前路径进行拼接
				file = new File(FileManager.filePath+File.separator+name);
				if (file.exists()) {
					//如果拼接的文件存在，对当前路径进行改变
					FileManager.filePath = FileManager.filePath+File.separator+name;
				} else {
					System.out.println("输入的文件不存在！请重新输入！");
					//如果输入的文件不存在，继续停留在当前路径
					file = new File(FileManager.filePath);
				}
			}
		}
		return file;
	}
	
	/**
	 * 将得到的File对象进行显示
	 */
	public static void showFiles(File file){
//		System.out.println("当前路径："+FileManager.filePath);
		if (file != null) {//文件是否为空
			if (file.exists()) {//文件是否存在
				if (file.isDirectory()) {//是否是文件夹
					File[] files = file.listFiles();
					if (files != null) {
						for (int i = 0; i < files.length; i++) {
							if (files[i].isDirectory()) {//是否为文件夹
								System.out.println(files[i]+"\t文件夹");
							} else {
								System.out.println(files[i]+"\t文件");
							}
						}
					} else {
						System.out.println(file+"\t这个文件夹为空!");
					}
				} else {
					System.out.println(file+"\t文件");
				}
			}
		}
		//递归
		FileManager.showFiles(FileManager.getFile());
	}
	
	
	public static void main(String[] args) {
		FileManager.showRoots();
		FileManager.showFiles(FileManager.getFile());
	}
	
}
