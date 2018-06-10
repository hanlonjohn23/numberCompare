import org.junit.Assert;
import org.junit.Test;

public class NumberComparatorTest {

    @Test
    public void intOnly_ValueOneIsGreater(){
        NumericInteger v1 = new NumericInteger(10);
        NumericInteger v2 = new NumericInteger(5);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(1, numericCompare.compare(v1,v2));
    }

    @Test
    public void intOnly_ValueOneIsLesser(){
        NumericInteger v1 = new NumericInteger(5);
        NumericInteger v2 = new NumericInteger(10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(-1, numericCompare.compare(v1,v2));
    }

    @Test
    public void intOnly_BothAreEqual(){
        NumericInteger v1 = new NumericInteger(10);
        NumericInteger v2 = new NumericInteger(10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(0, numericCompare.compare(v1,v2));
    }

    @Test
    public void intAndDouble_ValueOneIsGreater(){
        NumericInteger v1 = new NumericInteger(10);
        NumericDouble v2 = new NumericDouble(5.0);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(1, numericCompare.compare(v1,v2));
    }

    @Test
    public void intAndDouble_ValueOneIsLesser(){
        NumericInteger v1 = new NumericInteger(5);
        NumericDouble v2 = new NumericDouble(10.0);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(-1, numericCompare.compare(v1,v2));
    }

    @Test
    public void intAndDouble_BothAreEqual(){
        NumericInteger v1 = new NumericInteger(10);
        NumericDouble v2 = new NumericDouble(10.0);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(0, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndInt_ValueOneIsGreater(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericInteger v2 = new NumericInteger(5);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndInt_ValueOneIsLesser(){
        NumericDouble v1 = new NumericDouble(5.0);
        NumericInteger v2 = new NumericInteger(10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(-1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndInt_BothAreEqual(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericInteger v2 = new NumericInteger(10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(0, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleOnly_ValueOneIsGreater(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericDouble v2 = new NumericDouble(5.0);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleOnly_ValueOneIsLesser(){
        NumericDouble v1 = new NumericDouble(5.0);
        NumericDouble v2 = new NumericDouble(10.0);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(-1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleOnly_BothAreEqual(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericDouble v2 = new NumericDouble(10.0);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(0, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleOnly_ValueOneIsBarelyGreater(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericDouble v2 = new NumericDouble(9.9);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleOnly_ValueOneIsBarelyLesser(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericDouble v2 = new NumericDouble(10.1);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(-1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndString_ValueOneIsGreater(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericString v2 = new NumericString("5");

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndString_ValueOneIsLesser(){
        NumericDouble v1 = new NumericDouble(5.0);
        NumericString v2 = new NumericString("10");

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(-1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndString_BothAreEqual(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericString v2 = new NumericString("10");

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(0, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndLong_ValueOneIsGreater(){
        NumericDouble v1 = new NumericDouble(10.0);
        NumericLong v2 = new NumericLong((long) 5);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndLong_ValueOneIsLesser(){
        NumericDouble v1 = new NumericDouble(5.0);
        NumericLong v2 = new NumericLong((long) 10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(-1, numericCompare.compare(v1,v2));
    }

    @Test
    public void doubleAndLong_BothAreEqual() {
        NumericDouble v1 = new NumericDouble(10.0);
        NumericLong v2 = new NumericLong((long) 10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(0, numericCompare.compare(v1, v2));
    }
}