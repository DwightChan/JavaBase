package com._520it_04;

/**
	这个是我自定义的异常,表示的是注册失败时返回
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
