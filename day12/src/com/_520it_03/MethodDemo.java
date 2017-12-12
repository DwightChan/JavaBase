package com._520it_03;

import java.io.IOException;

public class MethodDemo {
	
}

class Zi extends Fu {
//	ok
//	@Override
//	public void work() throws NullPointerException, NumberFormatException {}
//	@Override
//	public void work() {}
//	@Override
//	public void work() throws NumberFormatException {}
	
//	@Override  //1.总类少 2.异常的类型更小 
//	public void work() throws Exception {}  不行,抛出了更大的异常
	@Override //3.不能抛出新的异常
	public void work() {}
}

class Fu {
	public void work() throws NullPointerException, NumberFormatException {}
}
