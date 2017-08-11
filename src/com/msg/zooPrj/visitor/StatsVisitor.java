package com.msg.zooPrj.visitor;

import com.msg.zooPrj.composite.Specimen;
import com.msg.zooPrj.composite.SpecimenGroupAL;
import com.msg.zooPrj.composite.SpecimenGroupHT;
import com.msg.zooPrj.singleton.ZooLog;

public class StatsVisitor implements Visitor {

	private int coutClass = 0;

	private int coutSpecimen = 0;

	public StatsVisitor() {
		ZooLog.logger.trace("Stats visitor created...");
	}

	@Override
	public void visit(SpecimenGroupAL a) {
		coutClass++;

	}

	@Override
	public void visit(SpecimenGroupHT a) {
		coutClass++;

	}

	@Override
	public void visit(Specimen m) {
		coutSpecimen++;

	}

	public int getCoutClass() {
		return coutClass;
	}

	public int getCoutSpecimen() {
		return coutSpecimen;
	}

}