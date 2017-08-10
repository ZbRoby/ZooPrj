package visitor;

import composite.SpecimenGroupAL;
import composite.SpecimenGroupHT;
import singleton.ZooLog;
import composite.Specimen;


public class StatsVisitor implements Visitor{

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