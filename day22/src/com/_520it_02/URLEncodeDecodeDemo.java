package com._520it_02;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncodeDecodeDemo {
	public static void main(String[] args) throws Exception {
		String data = "ni ºÃÂð?007";
		
		String code = URLEncoder.encode(data,"UTF-8");
		System.out.println(code);
		
		data = URLDecoder.decode(code, "UTF-8");
		System.out.println(data);
	}
}
