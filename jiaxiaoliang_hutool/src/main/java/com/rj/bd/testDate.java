package com.rj.bd;

import java.util.Calendar;
import java.util.Date;

import cn.hutool.core.date.DateUtil;

/*
 * 案例1：日期时间工具
 */
public class testDate {
public static void main(String[] args) {
	//Date、long、Calendar之间的相互转换
	//1.当前时间
	Date date = DateUtil.date();
	System.out.println(date);
	//2.当前时间
	Date date2 = DateUtil.date(Calendar.getInstance());
	System.out.println(date2);
	//3.当前时间
	Date date3 = DateUtil.date(System.currentTimeMillis());
	System.out.println("当前时间"+date3);
	//4.当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
	String now = DateUtil.now();
	System.out.println("当前时间字符串，格式：yyyy-MM-dd HH:mm:ss"+now);
	//5.当前日期字符串，格式：yyyy-MM-dd
	String today= DateUtil.today();
	System.out.println("当前日期字符串，格式：yyyy-MM-dd"+today);
	//6.字符串转日期
	String dateStr = "2020-02-20";
	Date date4 = DateUtil.parse(dateStr);
	System.out.println("字符串转日期:"+date4);
	//7.年龄
	int x=DateUtil.ageOfNow("2002-01-28");
    System.out.println("年龄："+x);
	//8.是否闰年
	boolean y=DateUtil.isLeapYear(2021);
	System.out.println("是否闰年:"+y);
}
}
