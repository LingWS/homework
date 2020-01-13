package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringCount {

	/**
	 * @description:字符串存到map中
	 * @param:str
	 * @return:map
	 */
	public String count(String str) {
		// 将字符串转换为数组
		char[] c = str.toCharArray();
		//将数组数据存到map中
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < c.length; i++) {
			Integer value = map.get(c[i]);
			if (!(c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z'))
				continue;
			if (value == null)
				map.put(c[i], 1);
			else
				map.put(c[i], value + 1);
		}

		// 调用迭代器输出map键值拼接字符串
		return maptoString(map);
		// System.out.println(maptoString(map));
	}
	
	/**
	 * @description:map拼接字符串输出
	 * @param:map
	 * @return:map的字符串
	 */
    private static String maptoString(Map<Character, Integer> map) {
		// 使用StringBuilder拼接字符串
        StringBuilder str = new StringBuilder();
        Iterator<Character> it = map.keySet().iterator();
        while(it.hasNext()){
            Character key = it.next();
            Integer value = map.get(key);
            str.append(key+"("+value+")");
        }
        return str.toString();
	}
}
