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
			FileReader fr = new FileReader(filePath);
			int n=0;
			char[] trainTxt=new char[30];
			while ((n=fr.read())!=-1) {
				System.out.print((char)n);
			}
//			while ((n=fr.read(trainTxt))!=-1) {
//				String s = new String(fr,0,n);
//				
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 

	}
}
