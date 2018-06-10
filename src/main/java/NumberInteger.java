public class NumberInteger implements Numeric<Integer> {
    Integer value;

    public NumberInteger(Integer value){
        this.value = value;
    }

    @Override
    public int getIntValue() {
        return value;
    }

    @Override
    public double getDoubleValue() {
        return value.doubleValue();
    }
}
