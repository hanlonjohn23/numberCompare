import java.util.Comparator;

/**
 * Code takes two numbers, compares those numbers, and prints the outcome of the comparison.
 * @author John Hanlon
 * @since 2018-06-09
 */

public class NumericCompare implements Comparator<Numeric> {

    @Override
    public int compare(Numeric o1, Numeric o2) {
        Integer v1 = o1.getIntValue();
        Integer v2 = o2.getIntValue();

        if (v1 > v2)
            return 1;
        else if (v1 < v2)
            return -1;
        else
            return 0;
    }


}
