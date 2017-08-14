package jUnitTesting.visitor;

import org.junit.Test;

import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.composite.Specimen;
import com.msg.zooPrj.composite.SpecimenGroupAL;
import com.msg.zooPrj.composite.SpecimenGroupHM;
import com.msg.zooPrj.visitor.StatsVisitor;

import junit.framework.TestCase;

/**
* Statistics visitor test
*/

public class TestStatsVisitor  extends TestCase{

	@Test
    public void test() {
		Animal all, group, s1, s2;
		
		all =  new SpecimenGroupAL("all");
		group = new SpecimenGroupHM("group");
		s1 = new Specimen("s1",5);
		s2 = new Specimen("s2",7);
		
		group.add(s1);
		group.add(s2);
		all.add(group);

		StatsVisitor stats = new StatsVisitor();
		all.acceptVisitor(stats);

        assertEquals(2,stats.getCoutSpecimen());
        assertEquals(2,stats.getCoutClass());
       
    }
}
