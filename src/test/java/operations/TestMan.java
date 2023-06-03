package operations;
//package src.main.java.manwoman;

//import dataprovider.TestDataProvider;
import manwoman.Man;
//import src.main.java.manwoman.Man;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestMan {
    @Test
    public void testManName(){

        Man manName = new Man("Mykola", "Jonsoniuk", 35);
        Assert.assertEquals(manName.getFirstName(), "Mykola");
    }
    @Test
    public void testManLastName(){

        Man manLastName = new Man("Mykola", "Jonsoniuk", 35);
        Assert.assertEquals(manLastName.getLastName(), "Jonsoniuk");
    }
    @Test
    public void testManRetired(){

        Man manRetired = new Man("Mykola", "Jonsoniuk", 35);
        Assert.assertEquals(manRetired.isRetired(), false);
    }

//    @Test(dataProvider = "fullname", dataProviderClass = TestDataProvider.class)
//    public void testFullName(String fName, String sName){
//
//        Man manFullName = new Man("Mykola", "Jonsoniuk", 35);
//        Assert.assertEquals(manFullName.add(fName, sName), "
//    }
}
