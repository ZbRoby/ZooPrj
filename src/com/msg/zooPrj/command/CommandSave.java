package com.msg.zooPrj.command;

import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.singleton.ZooLog;
import com.msg.zooPrj.visitor.SaveVisitor;

/**
 * @author marius
 * Implementation of command interface
 * Executes save visitor 
 */

public class CommandSave implements Command {

	private Animal a;
	private SaveVisitor v2;

	public CommandSave(Animal a) {
		this.a = a;
		ZooLog.logger.info("Save command created...");
		v2 = new SaveVisitor();
	}

	@Override
	public void execute() {

		v2.save(a, "test.txt");
		ZooLog.logger.info("Save command executed...");
	}

}
