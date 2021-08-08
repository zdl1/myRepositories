package com.git01.test;

/**
 * 
 * @author 张登琳  TEL：13810218664 QQ:1925159557
 * @since 2021年8月8日 下午1:04:58
 * @version 1.0.0
 */
public class Test01 {
	void m() {
		System.out.println("Test01.m()");
	};
	
	int n() {
		System.out.println("enclosing_type.enclosing_method()");
		return 1;
	}
	
	void mn() {
		System.out.println("Test01.mn()");
	}
}
