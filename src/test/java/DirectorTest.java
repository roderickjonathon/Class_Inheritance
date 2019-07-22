import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("22324125", "George",50000,"Executive", 200000);

    }

    @Test
    public void canGetRaise(){
        director.raiseSalaray(200);
        assertEquals(50200, director.getSalary());


    }

    @Test
    public void canGetBonus(){
        director.payBonus();
        assertEquals(51000, director.getSalary());
    }

    @Test
    public void canGetBudget(){
        assertEquals(200000, director.getBudget(), 0);
    }

    @Test
    public void canChangeName(){
        director.setName("TestName");
        assertEquals("TestName", director.getName());
    }

    @Test
    public void cantChangeifNull(){
        director.setName(null);
        assertEquals("George", director.getName());
    }

    @Test
    public void cantRaiseNegativeValue(){
        director.raiseSalaray(-2);
        assertEquals(50000, director.getSalary());
    }
}
