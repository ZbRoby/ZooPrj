package com.msg.zooPrj;

import com.msg.zooPrj.command.Command;
import com.msg.zooPrj.command.CommandOpen;
import com.msg.zooPrj.command.CommandSave;
import com.msg.zooPrj.command.CommandStats;
import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.singleton.SingletonEnum;
import com.msg.zooPrj.singleton.ZooLog;

/**
 * 
 * @author marius
 * Main for testing open command
 */

public class CommandMain {

	public static void main(String[] args) {
		
		Command open = new CommandOpen("Zoo.xml");
		open.execute();

		Animal all = SingletonEnum.INSTANCE.getSpecime();
		ZooLog.logger.info(all.toString());
		
		Command stats = new CommandStats(all);
		stats.execute();
		
		Command save = new CommandSave(all);
		save.execute();

	}

}
