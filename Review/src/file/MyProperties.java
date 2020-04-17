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
 *��дProperties�ļ� properties ���Լ�
 */
public class MyProperties {

		public static void main(String[] args) {
			try {
				//��ȡProperties�ļ����� newһ��Properties����
				Properties p=new Properties();
				//��ȡproperties�ļ�����·��
				File file=new File(".\\src\\wyl.properties");
				//��ȡproperties�ļ�������
				InputStream is=new FileInputStream(file);
				//�����ļ������������ж�ȡ�����б�
				p.load(is);
				//5.ʹ��Properties���еķ��������ļ���
				//a.ͨ��key��ȡ����value����ָ���ļ��ڴ������б����������ԣ�
				String admin=p.getProperty("admin");
				String password=p.getProperty("password");
//				System.out.println(admin);
//				System.out.println(password);
				System.out.println("-------------");
				//ͨ��propertyNames()��ȡ���е�key��������ö�٣�p.keys()����һ��
				Enumeration<?> enums=p.propertyNames();
				System.out.println("����һ-----");
				while(enums.hasMoreElements()){
					String key=enums.nextElement().toString();
					String value=p.getProperty(key);
					System.out.println("key:"+key+"  ,value:"+value);				
				}
				//ͨ��keset������ȡSet<Object> ���� Ȼ�����
				//properties �̳��� hashtable ���� ������keySet����
				Set<?> s=	p.keySet();
				//�õ�����ȥ����
				Iterator <?>it=s.iterator();
				System.out.println("������-----");
					while(it.hasNext()){					
						String key1=  it.next().toString();
						//String v=p.getProperty(key1);
						String value1=p.getProperty(key1);//��ָ���ļ��ڴ������б�����������
						System.out.println("key1:"+key1+",   value1:"+value1);
					}
					System.out.println("������--------------");
				Set<String> ss=p.stringPropertyNames();
				for (String str : ss) {
					String v=p.getProperty(str);
					System.out.println("����"+str+",ֵ��"+v);
				}
				
					//2. д���ļ�
					p.setProperty("tedian", "��˧Ŷ");
					p.setProperty("jinchi", "����");
					OutputStream out=new FileOutputStream(".\\src\\wyl.properties");
					//��д�õ������������д��properties ��
					p.store(out, "yes");
					out.flush();
					out.close();
					is.close();
					System.out.println("д�����");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
