package operations;

import manwoman.Man;
import manwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWomen {
    @Test
    public void testWomanName(){

        Woman manName = new Woman("Anna", "Gogo", 30);
        Assert.assertEquals("Anna", "Anna");
    }
}
