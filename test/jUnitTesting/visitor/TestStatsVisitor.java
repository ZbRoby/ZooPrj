package jUnitTesting.visitor;

import org.junit.Test;
import com.msg.zooPrj.visitor.StatsVisitor;
import junit.framework.TestCase;

/**
* Statistics visitor test
*/

public class TestStatsVisitor  extends TestCase{

	@Test
    public void test() {
		StatsVisitor stats = new StatsVisitor(); 

        assertEquals(0,stats.getCoutSpecimen());
        assertEquals(0,stats.getCoutClass());
       
    }
}
