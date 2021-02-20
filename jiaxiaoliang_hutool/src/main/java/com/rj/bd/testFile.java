package com.rj.bd;
/*
 * 案例3：文件类型判断
 */
import java.io.File;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;

public class testFile {
public static void main(String[] args) {
	File file = FileUtil.file("d:/666.xlsx");
	String type = FileTypeUtil.getType(file);
	//输出 jpg则说明确实为jpg文件
	Console.log("文件类型为："+type);
}
}
