package com.msg.zooPrj.command;

import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.singleton.ZooLog;
import com.msg.zooPrj.visitor.StatsVisitor;

/**
 * @author marius
 * Implementation of command interface
 * Executes statistics visitor 
 */

public class CommandStats implements Command {

	private Animal a;
	private StatsVisitor v;

	public CommandStats(Animal a) {
		this.a = a;
		ZooLog.logger.info("Stats command created...");
		v = new StatsVisitor();
	}

	@Override
	public void execute() {

		a.acceptVisitor(v);
			
		ZooLog.logger.info("Count report:\n"+
				"-----------------------------------------------------------------\n"
				+ "|\tSpecimen:\t\t|\t" + v.getCoutSpecimen()+"\t\t\t|\n"
				+ "|\tGroups:\t\t\t|\t" + v.getCoutClass()+"\t\t\t|\n"+
				"-----------------------------------------------------------------");

		ZooLog.logger.info("Stats command executed...");
	}

}
