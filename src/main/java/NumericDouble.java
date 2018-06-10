public class NumericDouble implements Numeric<Double>{
    Double value;

    public NumericDouble(Double value){
        this.value = value;
    }

    @Override
    public double getDoubleValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
