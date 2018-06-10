import org.junit.Assert;
import org.junit.Test;

public class NumberComparorTest {

    @Test
    public void valueOneIsGreater(){
        Assert.assertEquals(new NumberComparor(1,0).toString(), "1 is greater than 0.");
    }

    @Test
    public void valueOneIsLesser(){
        Assert.assertEquals(new NumberComparor(0,1).toString(), "0 is less than 1.");
    }

    @Test
    public void bothAreEqual(){
        Assert.assertEquals(new NumberComparor(1,1).toString(), "1 is equal to 1.");
    }
}