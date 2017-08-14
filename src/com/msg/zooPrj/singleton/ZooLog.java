package com.msg.zooPrj.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*  singleton zoo loger that logs in all project   */
public class ZooLog {

	private static ZooLog ins = new ZooLog();
	public static final Logger logger = LogManager.getLogger(ZooLog.class);

	private ZooLog() {
	}

	public ZooLog getInstance() {
		return ins;
	}
}
