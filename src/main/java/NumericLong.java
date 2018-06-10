public class NumericLong implements Numeric<Long>{
    Long value;

    public NumericLong(Long value){
        this.value = value;
    }

    @Override
    public double getDoubleValue() {
        return value.doubleValue();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
