package ao_unitTesting;

import ao_tickets.AO_Tickets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AO_UnitTest {
    @Test
    public void ao_TicketsTest_infant_priceIsZero(){
        // Arrange - Given
        AO_Tickets infant = new AO_Tickets(1, 1000);

        // Act- When
        double result = infant.getPrice();

        // Assert - Then
        Assert.assertEquals(0.0, result);
    }

    @Test
    public void ao_TicketsTest_child_priceIs50percent(){
        AO_Tickets child = new AO_Tickets(8, 1000);
        double result= child.getPrice();
        Assert.assertEquals(500.0,result);
    }

    @Test
    public void ao_TicketsTest_adult_fullPrice(){
        AO_Tickets adult = new AO_Tickets(18, 1000);
        double result = adult.getPrice();
        Assert.assertEquals(1000.0, result);
    }

    @Test
    public void ao_TicketsTest_senior_priseIs80percent(){
        AO_Tickets senior = new AO_Tickets(65, 1000);
        double result = senior.getPrice();
        Assert.assertEquals(800.0, result);
    }

}
