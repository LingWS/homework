package iofile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author wushaoling
 * @description 读写文件
 */
public class IOFile {

/*
 * @description 读取培训文件
 */
	public void inputTrianFile(String filePath) throws IOException{
		try {
			//使用字符流读取文件
			FileReader fr = new FileReader(filePath);
			int n=0;
			while ((n=fr.read())!=-1) {
				System.out.print((char)n);
			}

			//将读取到的字符数组转为字符串数组

			//数据拆分存到二位数组，把存储后的定义为一个全局变量，共mian方法调用，传值给统计方法
			//通过两层循环
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 

	}
}
