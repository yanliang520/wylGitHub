package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 *读写Properties文件 properties 属性集
 */
public class MyProperties {

		public static void main(String[] args) {
			try {
				//读取Properties文件内容 new一个Properties对象
				Properties p=new Properties();
				//获取properties文件对象路径
				File file=new File(".\\src\\wyl.properties");
				//获取properties文件输入流
				InputStream is=new FileInputStream(file);
				//载入文件（从输入流中读取属性列表）
				p.load(is);
				//5.使用Properties类中的方法操作文件流
				//a.通过key获取单个value（用指定的键在此属性列表中搜索属性）
				String admin=p.getProperty("admin");
				String password=p.getProperty("password");
//				System.out.println(admin);
//				System.out.println(password);
				System.out.println("-------------");
				//通过propertyNames()获取所有的key（键）的枚举，p.keys()方法一样
				Enumeration<?> enums=p.propertyNames();
				System.out.println("方法一-----");
				while(enums.hasMoreElements()){
					String key=enums.nextElement().toString();
					String value=p.getProperty(key);
					System.out.println("key:"+key+"  ,value:"+value);				
				}
				//通过keset方法获取Set<Object> 集合 然后遍历
				//properties 继承了 hashtable 集合 所以有keySet方法
				Set<?> s=	p.keySet();
				//用迭代器去接收
				Iterator <?>it=s.iterator();
				System.out.println("方法二-----");
					while(it.hasNext()){					
						String key1=  it.next().toString();
						//String v=p.getProperty(key1);
						String value1=p.getProperty(key1);//用指定的键在此属性列表中搜索属性
						System.out.println("key1:"+key1+",   value1:"+value1);
					}
					System.out.println("方法三--------------");
				Set<String> ss=p.stringPropertyNames();
				for (String str : ss) {
					String v=p.getProperty(str);
					System.out.println("键："+str+",值："+v);
				}
				
					//2. 写入文件
					p.setProperty("tedian", "很帅哦");
					p.setProperty("jinchi", "伊人");
					OutputStream out=new FileOutputStream(".\\src\\wyl.properties");
					//将写好的内容用输出流写入properties 中
					p.store(out, "yes");
					out.flush();
					out.close();
					is.close();
					System.out.println("写入完成");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
