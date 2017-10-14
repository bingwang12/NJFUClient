package controller;

import sun.misc.BASE64Encoder;
/**
 * BASE64Encoder加密
 * @author WangBing
 *
 */
public class EncoderByBASE64Encoder {
	/**
	 * 
	 * @param str 需要加密的字符串
	 * @return  加密后的字符串
	 */
	public String Ender(String str) {
		BASE64Encoder ender = new BASE64Encoder();
		String encode = ender.encode(str.getBytes());
		return encode;
	}
}
