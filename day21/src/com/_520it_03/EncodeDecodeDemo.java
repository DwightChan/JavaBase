package com._520it_03;

import java.util.Arrays;

public class EncodeDecodeDemo {
	public static void main(String[] args) throws Exception {
		//小日本有活动,要日自己
		String data = "小日本有活动,要日自己";
		//编码
//[-48, -95, -56, -43, -79, -66, -45, -48, -69, -18, -74, -81, 44, -46, -86, -56, -43, -41, -44, -68, -70]
//		byte[] bs = data.getBytes();//使用系统默认码表进行编码  系统默认是GBK,1个中文2个字节
		byte[] bs = data.getBytes("UTF-8");//指定码表来编码  UTF-8中一个中文3个字节
		System.out.println("len:" + bs.length);//21
		System.out.println("编码后:" + Arrays.toString(bs));
		
		//解码
//		System.out.println("解码后:" + new String(bs));
//		System.out.println("解码后:" + new String(bs, "GBK"));//编码和解码不一致就会出现乱码
		System.out.println("解码后:" + new String(bs, "UTF-8"));
	}
}
