import java.util.Comparator;

public class NumericCompare implements Comparator<Numeric> {

    @Override
    public int compare(Numeric o1, Numeric o2) {
        Double v1 = o1.getDoubleValue();
        Double v2 = o2.getDoubleValue();

        return v1.compareTo(v2);
    }

}
