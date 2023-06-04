package operations;

import manwoman.Man;
import manwoman.Person;
import manwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWoman {

    private Woman womantest;
    @BeforeMethod
    public void createWomanTest(){
        womantest = new Woman("Anna", "Gogo", 62);
    }

    private Man manhusbend;
    @BeforeMethod
    public void createManTest(){
        manhusbend = new Man("Den", "Lynch", 35);
    }
    @Test
    public void testWomanName(){

        Assert.assertEquals(womantest.getFirstName(), "Anna");
    }
    @Test
    public void testWomanLastName(){

        Assert.assertEquals(womantest.getLastName(), "Gogo");
    }
    @Test
    public void testWomanRetired(){

        Assert.assertEquals(womantest.isRetired(), true);
    }


    @Test
    public void testRegistrationPartnership(){
        Assert.assertEquals(manhusbend.registerPartnership(womantest), );

    }
}
