package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

 public class UnitTest {
    @Test
    public void ticketsTest_infant_priceIsZero(){
        //Arrange -Given
        Tickets infant = new Tickets(1,1000);


        //Act-When
        double result = infant.getPrice();


        //Assert-Then
        Assert.assertEquals(result,0.0);
    }

    @Test
    public void ticketsTest_child_priceIsZero(){
        Tickets child =new Tickets(8,1000);
        double result=child.getPrice();
        Assert.assertEquals(result,500.0);

    }
    @Test
    public void ticketsTest_adult_fullPrice() {
        Tickets child = new Tickets(18, 1000);
        double result = child.getPrice();
        Assert.assertEquals(result, 1000.0);
    }
    @Test
    public void ticketsTest_senior_priceIs80percent() {
        Tickets child = new Tickets(18, 1000);
        double result = child.getPrice();
        Assert.assertEquals(result, 1000.0);
    }
}
