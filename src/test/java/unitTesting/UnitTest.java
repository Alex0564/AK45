package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

public class UnitTest {
    @Test

    /* test name consists of three parts
    1st - what is tested
    2nd -
    3rd - expected result
     */
    public void ticketsTest_infant_priceIsZero(){
        //Arrange - Given
        Tickets infant = new Tickets(1,1000);

        //Act - When
        double result = infant.getPrice();

        //Assert - Then
        Assert.assertEquals(result, 0.0);
    }
    @Test
    public void ticketsTest_child_priceIs50percent(){
        Tickets child = new Tickets(8,1000);
        double result = child.getPrice();
        Assert.assertEquals(result,500.0);
    }
    @Test
    public void ticketsTest_adult_fullPrice(){
        Tickets adult = new Tickets(25,1000);
        double result = adult.getPrice();
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void ticketsTest_senior_priceIs80Percent(){
        Tickets senior = new Tickets(75,1000);
        double result = senior.getPrice();
        Assert.assertEquals(result,800.0);
    }
}
