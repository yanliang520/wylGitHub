package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class ProTest {
	public static void main(String[] args) {
		Properties pro = new Properties();
		InputStream is = ProTest.class.getClassLoader().getResourceAsStream("wyl.properties");
		FileOutputStream  fos= null;
		try {
			pro.load(is);
			String admin = pro.getProperty("admin" );
			//System.out.println(admin);
			Set<String> set = pro.stringPropertyNames();
			for (String string : set) {
				String name=pro.getProperty(string);
				System.out.println(name);
			}
			pro.setProperty("xx", "lllll");
			pro.setProperty("vv", "vv");
			String path =ProTest.class.getClassLoader().getResource("wyl.properties").getPath();
			System.out.println(path);
			String patht=System.getProperty("user.dir")+"/src/wyl.properties";
			//System.out.println(patht);
			String str=ProTest.class.getClassLoader().getResource("").getPath()+"wyl.properties";
			System.out.println(str);
			fos=new FileOutputStream(patht);
			pro.store(fos, "hhhhhh");
			fos.flush();
			fos.close();
			is.close();
			System.out.println("写入文件完成");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
