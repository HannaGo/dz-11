package operations;
//package src.main.java.manwoman;

//import dataprovider.TestDataProvider;
import manwoman.Man;
//import src.main.java.manwoman.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestMan {

    private Man mantest;
    @BeforeMethod
    public void createManTest(){
        mantest = new Man("Mykola", "Jonsoniuk", 35);
    }

    @Test
    public void testManName(){

        Assert.assertEquals(mantest.getFirstName(), "Mykola");
    }
    @Test
    public void testManLastName(){

        Assert.assertEquals(mantest.getLastName(), "Jonsoniuk");
    }
    @Test
    public void testManRetired(){

        Assert.assertEquals(mantest.isRetired(), false);
    }

//    @Test(dataProvider = "fullname", dataProviderClass = TestDataProvider.class)
//    public void testFullName(String fName, String sName){
//
//        Man manFullName = new Man("Mykola", "Jonsoniuk", 35);
//        Assert.assertEquals(manFullName.add(fName, sName), "
//    }
}
