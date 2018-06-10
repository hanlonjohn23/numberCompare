public class NumberComparor {
    private Integer value1;
    private Integer value2;

    public NumberComparor(Integer value1, Integer value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        if(value1 > value2)
            return value1 + " is greater than " + value2 + ".";
        else if(value1 < value2)
            return value1 + " is less than " + value2 + ".";
        else
            return value1 + " is equal to " + value2 + ".";
    }
}
