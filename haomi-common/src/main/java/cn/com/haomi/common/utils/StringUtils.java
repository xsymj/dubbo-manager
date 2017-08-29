/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.common.utils;

import java.util.Random;

public class StringUtils{
	
	// 创建一个随机字符串,不以零开头
			public static String coverZero(Long valve, int length) {

				return String.format("%0" + length + "d", valve);
			}

			// 创建一个随机字符串,不以零开头
			public static String createCodeTwo(int num) {
				StringBuffer sRand = new StringBuffer();
				Random random = new Random();
				for (int i = 0; i < num; i++) {
					int temp = random.nextInt(10);
					if (i == 0 && temp == 0) {
						temp = 1;
					}
					sRand.append(String.valueOf(temp));
				}
				return sRand.toString();
			}
			
}