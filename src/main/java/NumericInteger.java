public class NumericInteger implements Numeric<Integer> {
    Integer value;

    public NumericInteger(Integer value){
        this.value = value;
    }

    @Override
    public double getDoubleValue() {
        return value.doubleValue();
    }
}
