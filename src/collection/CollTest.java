package collection;

import java.util.Scanner;

public class CollTest {

	public static void main(String[] args) {
		// 键盘输入字符串
		System.out.println("请输入一个字符串");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		// 统计字符串字母出现的次数
		StringCount coll = new StringCount();
		String count = coll.count(str);

		// 输出返回结果
		System.out.println(count);
	}
}