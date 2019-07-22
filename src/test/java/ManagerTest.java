import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("JR22FF22", "Jeff", 42000, "Books");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalaray(100.00);
        assertEquals(42100.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(42420, manager.getSalary());
    }



}
