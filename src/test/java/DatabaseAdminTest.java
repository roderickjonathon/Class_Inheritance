import Staff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("JS222222", "Gary", 28000);
    }

    @Test
    public void canGetRaise(){
        databaseAdmin.raiseSalaray(200);
    assertEquals(28200, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        databaseAdmin.payBonus();
        assertEquals(28280, databaseAdmin.getSalary());
    }
}
