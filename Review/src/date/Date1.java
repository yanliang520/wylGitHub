package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("ԭ���ڸ�ʽ��ӡ��"+d);
		System.out.println("ԭ���ڸ�ʽ��ӡtoGMTString��"+d.toGMTString());
		System.out.println("ԭ���ڸ�ʽ��ӡtoLocaleString��"+d.toLocaleString());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(d.toGMTString())));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d));
		
		
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy��MM��dd��");
		Calendar c1=Calendar.getInstance();//��ȡ��ǰʱ����1970�굽���ڵĺ�����			
		c.set(1992, 7-1, 14);
		String str=sd.format(c.getTime());//�����ڸ�ʽ����Ϊָ����ģʽ
		String str1=sd.format(c1.getTime());
		int day=c.get(Calendar.DAY_OF_WEEK)-1;
		
//		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println("�������������"+c1.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.YEAR));//��ȡ��
//		System.out.println(c.get(Calendar.MONTH)+1);//��ȡ��
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));//��ȡ��
//		System.out.println(str+"�����ڣ�"+day);
//		System.out.println(str1);
	}
}
