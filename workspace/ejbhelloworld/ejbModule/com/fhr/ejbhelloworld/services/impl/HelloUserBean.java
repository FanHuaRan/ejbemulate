package com.fhr.ejbhelloworld.services.impl;

import com.fhr.ejbhelloworld.services.IHelloUser;
/**
 * 会话bean实现
 * @author fhr
 * @since 
 */
public class HelloUserBean implements IHelloUser {
	
	private static final String HELLO_FORMAT="hello %s !";

	@Override
	public String sayHello(String name) {
		String helloStr=String.format(HELLO_FORMAT, name);
		System.out.println(helloStr);
		return helloStr;
	}

}
