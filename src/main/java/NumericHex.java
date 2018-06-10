public class NumericHex implements Numeric<String> {
    String value;

    public NumericHex(String value){
        this.value = value;
    }

    @Override
    public double getDoubleValue() {
        Long longValue = Long.parseLong(value, 16);     //Use Long since Double does not allow to parse by radix
        return longValue.doubleValue();
    }

    @Override
    public String toString() {
        return value;
    }
}
