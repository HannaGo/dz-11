import manWoman.Man;
import org.testng.Assert;

public class TestTests {
    public void testManName(){
        Man manName = new Man();
        Assert.assertEquals(manName.getFirstName(), "Gor");

    }
}
