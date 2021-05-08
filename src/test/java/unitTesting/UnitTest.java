package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

public class UnitTest {
    @Test
    public void ticketsTest_infant_priceIsZero(){
        Tickets infant = new Tickets(1,1000);

        double result = infant.getPrice();

        Assert.assertEquals(result,0.0);
    }
}
