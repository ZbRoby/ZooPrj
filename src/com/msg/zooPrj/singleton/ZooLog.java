package com.msg.zooPrj.singleton;

import java.util.logging.Logger;


/*  singleton zoo loger that logs in all project   */
public class ZooLog {

	private static ZooLog ins = new ZooLog();
	public static final Logger logger = Logger.getLogger("ZooLog");

	private ZooLog() {
	}

	public ZooLog getInstance() {
		return ins;
	}
}
