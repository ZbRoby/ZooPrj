package com.msg.zooPrj.command;

import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.singleton.ZooLog;
import com.msg.zooPrj.visitor.StatsVisitor;

/**
 * Implementation of command interface
 * Executes statistics visitor 
 */

public class CommandStats implements Command {

	private Animal a;
	private StatsVisitor v;

	public CommandStats(Animal a) {
		this.a = a;
		ZooLog.logger.trace("Stats command created...");
		v = new StatsVisitor();
	}

	@Override
	public void execute() {

		a.acceptVisitor(v);
			
		ZooLog.logger.trace("Count report:\n"+
				"-----------------------------------------------------------------\n"
				+ "|\tSpecimen:\t\t|\t" + v.getCoutSpecimen()+"\t\t\t|\n"
				+ "|\tGroups:\t\t\t|\t" + v.getCoutClass()+"\t\t\t|\n"+
				"-----------------------------------------------------------------");

		ZooLog.logger.trace("Stats command executed...");
	}

}
