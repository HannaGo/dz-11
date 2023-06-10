package operations;

import manwoman.Man;
import manwoman.Person;
import manwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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




//    THIS TEST IS FAILED. I UNDERSTAND THAT WE SHOULD INDICATE HERE partnership (Class Person, method registerPartnership) BUT I DON'T UNDERSTAND HOW?
//    WITHOUT THIS TEST OTHER TESTS ARE RUNNING AND PASSING.

    @Test
    public void testRegistrationPartnership(){
        Assert.assertEquals(womantest.lastName(womantest.registerPartnership(manhusbend)), "Gogo");
//        System.out.println(womantest);
    }

    @Test
    public void testDeregisterPartnershipLastName(){

//        Assert.assertEquals(womantest.deregisterPartnership(this.manhusbend), womantest.lastName = "Gogo");
        System.out.println("test of deregidtering of partnership.");
    }

//    @Test
//    public void testDeregisterPartnershipNull(){
//
//        Assert.assertEquals(manhusbend.deregisterPartnership(womantest), "test");
//    }

//    @DataProvider(name = "relationship")
//    public static Object[][] relationship(){
//        return new Object[][] {{"Lynch"},{"Gogo"}};
//    }

}
