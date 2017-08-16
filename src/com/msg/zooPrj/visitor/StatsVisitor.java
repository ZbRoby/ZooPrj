package com.msg.zooPrj.visitor;

import com.msg.zooPrj.composite.Specimen;
import com.msg.zooPrj.composite.SpecimenGroupAL;
import com.msg.zooPrj.composite.SpecimenGroupHM;
import com.msg.zooPrj.singleton.ZooLog;

/**
 * @author marius
 * Implementation of visitor interface
 * Counts the number of each type of object
 */

public class StatsVisitor implements Visitor {

	private int coutClass = 0;

	private int coutSpecimen = 0;

	public StatsVisitor() {
		ZooLog.logger.info("Stats visitor created...");
	}

	@Override
	public void visit(SpecimenGroupAL a) {
		coutClass++;

	}

	@Override
	public void visit(SpecimenGroupHM a) {
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