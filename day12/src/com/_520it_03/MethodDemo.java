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
	
//	@Override  //1.������ 2.�쳣�����͸�С 
//	public void work() throws Exception {}  ����,�׳��˸�����쳣
	@Override //3.�����׳��µ��쳣
	public void work() {}
}

class Fu {
	public void work() throws NullPointerException, NumberFormatException {}
}
