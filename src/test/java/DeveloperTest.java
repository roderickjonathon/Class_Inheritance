import Staff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("JS222222", "Gary", 28000);
    }

    @Test
    public void canGetRaise(){
        developer.raiseSalaray(200);
        assertEquals(28200, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        developer.payBonus();
        assertEquals(28280, developer.getSalary());
    }
}
