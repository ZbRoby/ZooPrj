package com.msg.zooPrj.command;

import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.singleton.ZooLog;
import com.msg.zooPrj.visitor.StatsVisitor;

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

		System.out.println("Specimen: " + v.getCoutSpecimen());
		System.out.println("Groups: " + v.getCoutClass());

		ZooLog.logger.trace("Stats command executed...");
	}

}