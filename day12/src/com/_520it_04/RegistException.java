package com._520it_04;

/**
	��������Զ�����쳣,��ʾ����ע��ʧ��ʱ����
*/
//public class RegistException extends Exception {
public class RegistException extends RuntimeException {

	public RegistException() {
		super();
	}

	public RegistException(String message) {
		super(message);
	}

	public RegistException(Throwable cause) {
		super(cause);
	}
}
