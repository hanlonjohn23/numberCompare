public class NumericString implements Numeric<String> {
    private String value;

    public NumericString(String value){
        this.value = value;
    }

    @Override
    public double getDoubleValue() {
        return Double.parseDouble(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
