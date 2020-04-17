package file.seach;

import java.io.File;
import java.util.Scanner;

/**
 * �����ļ�
 * @author yanliang
 *
 */
public class FileManager {
public static String filePath = "";//��ǰ�������ڵ�·��
	
	/**
	 * ��ʾ��Ŀ¼
	 */
	public static void showRoots(){
		//��ȡ��Ŀ¼����File����
		File[] files = File.listRoots();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
	
	
	/**
	 * ��ȡ��ǰ·�����ڵ��ļ�����
	 * @param name ������ļ���
	 */
	public static File getFile(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ����ļ�������");
		String name=scanner.nextLine();
		File file = null;//����һ��File��������ã��������յ�ǰ��file����
		if ("b".equalsIgnoreCase(name)) {//����������back
			file = new File(FileManager.filePath);
			file = file.getParentFile();//��ȡ��һ��·��
			if (file != null) {
				FileManager.filePath = file.getPath();//��ȡ��һ��·��
			} else {
				FileManager.filePath = "";//�ص���Ŀ¼
				System.out.println("�Ѿ����˸�Ŀ�������ٻ����ˣ�");
				//����ļ������ڣ���ʾ��·��
				FileManager.showRoots();
			}
		} else if ("c".equalsIgnoreCase(name)) {
			System.out.println("���������");
			System.exit(0);
		} else {
			if ("".equals(FileManager.filePath)) {//���Ϊ�գ�֤��Ϊ��Ŀ¼��ֱ�ӵõ��ļ�����
				file = new File(name+":"+File.separator);
				if (file.exists()) {
					//����Ŀ¼��ֵ��ǰ·��
					FileManager.filePath = file.getPath();
				} else {
					System.out.println("����ĸ�·���������������룡");
					//����ļ������ڣ���ʾ��·��
					FileManager.showRoots();
				}
			} else {
				//�����Ǹ�Ŀ¼���õ�ǰ·������ƴ��
				file = new File(FileManager.filePath+File.separator+name);
				if (file.exists()) {
					//���ƴ�ӵ��ļ����ڣ��Ե�ǰ·�����иı�
					FileManager.filePath = FileManager.filePath+File.separator+name;
				} else {
					System.out.println("������ļ������ڣ����������룡");
					//���������ļ������ڣ�����ͣ���ڵ�ǰ·��
					file = new File(FileManager.filePath);
				}
			}
		}
		return file;
	}
	
	/**
	 * ���õ���File���������ʾ
	 */
	public static void showFiles(File file){
//		System.out.println("��ǰ·����"+FileManager.filePath);
		if (file != null) {//�ļ��Ƿ�Ϊ��
			if (file.exists()) {//�ļ��Ƿ����
				if (file.isDirectory()) {//�Ƿ����ļ���
					File[] files = file.listFiles();
					if (files != null) {
						for (int i = 0; i < files.length; i++) {
							if (files[i].isDirectory()) {//�Ƿ�Ϊ�ļ���
								System.out.println(files[i]+"\t�ļ���");
							} else {
								System.out.println(files[i]+"\t�ļ�");
							}
						}
					} else {
						System.out.println(file+"\t����ļ���Ϊ��!");
					}
				} else {
					System.out.println(file+"\t�ļ�");
				}
			}
		}
		//�ݹ�
		FileManager.showFiles(FileManager.getFile());
	}
	
	
	public static void main(String[] args) {
		FileManager.showRoots();
		FileManager.showFiles(FileManager.getFile());
	}
	
}
