package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("原日期格式打印："+d);
		System.out.println("原日期格式打印toGMTString："+d.toGMTString());
		System.out.println("原日期格式打印toLocaleString："+d.toLocaleString());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(d.toGMTString())));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d));
		
		
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy年MM月dd日");
		Calendar c1=Calendar.getInstance();//获取当前时间自1970年到现在的毫秒数			
		c.set(1992, 7-1, 14);
		String str=sd.format(c.getTime());//将日期格式设置为指定的模式
		String str1=sd.format(c1.getTime());
		int day=c.get(Calendar.DAY_OF_WEEK)-1;
		
//		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println("当月最大天数："+c1.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.YEAR));//获取年
//		System.out.println(c.get(Calendar.MONTH)+1);//获取月
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));//获取日
//		System.out.println(str+"是星期："+day);
//		System.out.println(str1);
	}
}
