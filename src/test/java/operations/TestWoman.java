package operations;

import manwoman.Man;
import manwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWoman {
    @Test
    public void testWomanName(){

        Woman womanName = new Woman("Anna", "Gogo", 30);
        Assert.assertEquals(womanName.getFirstName(), "Anna");
    }
    @Test
    public void testWomanLastName(){

        Woman womanLastName = new Woman("Anna", "Gogo", 30);
        Assert.assertEquals(womanLastName.getLastName(), "Gogo");
    }
    @Test
    public void testWomanRetired(){

        Woman womanRetired = new Woman("Anna", "Gogo", 62);
        Assert.assertEquals(womanRetired.isRetired(), true);
    }

    public void testmaidenName(){

    }
}
