import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class NumberComparorTest {

    @Test
    public void intOnly_ValueOneIsGreater(){
        NumberInteger v1 = new NumberInteger(10);
        NumberInteger v2 = new NumberInteger(5);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(numericCompare.compare(v1,v2), 1);
    }

    @Test
    public void intOnly_ValueOneIsLesser(){
        NumberInteger v1 = new NumberInteger(5);
        NumberInteger v2 = new NumberInteger(10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(numericCompare.compare(v1,v2), -1);
    }

    @Test
    public void intOnly_BothAreEqual(){
        NumberInteger v1 = new NumberInteger(10);
        NumberInteger v2 = new NumberInteger(10);

        NumericCompare numericCompare = new NumericCompare();

        Assert.assertEquals(numericCompare.compare(v1,v2), 0);
    }

}