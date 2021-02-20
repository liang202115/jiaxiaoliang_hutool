package com.rj.bd;

import java.util.Date;
import java.util.List;

import cn.hutool.core.convert.Convert;

/*
 * 案例二：类型转换
 */
public class testtype {
public static void main(String[] args) {
	//1.转换为字符串
	int a = 1;
	//aStr为"1"
	String aStr = Convert.toStr(a);
	System.out.println(aStr);
	long[] b = {1,2,3,4,5};
	String bStr = Convert.toStr(b);
	System.out.println(bStr);
	//2.转换为集合
	Object[] a2 = {"a", "你", "好", "", 1};
	List<?> list = Convert.convert(List.class, a2);
	System.out.println(list);
	//从4.1.11开始可以这么用
	List<?> list2 = Convert.toList(a);
	System.out.println(list2);
	//3.转换为日期对象：
	String a3 = "2020-02-20";
	Date value = Convert.toDate(a3);
	System.out.println(value);
}
}
