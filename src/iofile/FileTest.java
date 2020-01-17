package iofile;
/**
 * 
 * @author wushaoling
 * @description 测试类
 */
public class FileTest {

	public static void main(String[] args) throws Exception{
		//读取培训文件
		IOFile f=new IOFile();
		f.inputTrianFile(System.getProperty("user.dir")+"/src/iofile/培训情况统计.txt");

	}

}
