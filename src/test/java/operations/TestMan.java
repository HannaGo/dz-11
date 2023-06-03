package operations;
//package src.main.java.manwoman;

import manwoman.Man;
//import src.main.java.manwoman.Man;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestTests {
    @Test
    public void testManName(){

        Man manName = new Man("Mykola", "Jonsoniuk", 35);
        Assert.assertEquals("Mykola", "Mykola");
    }
}
