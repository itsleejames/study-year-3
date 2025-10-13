import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class SampleClass {

    private String fieldOne;
    private double fieldTwo;
    private int fieldThree;
    private boolean fieldFour;
    private int[] fieldFive;
    private static char fieldSix;
    private static long fieldSeven;

    public String getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public double getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(double fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public int getFieldThree() {
        return fieldThree;
    }

    public void setFieldThree(int fieldThree) {
        this.fieldThree = fieldThree;
    }

    public boolean isFieldFour() {
        return fieldFour;
    }

    public void setFieldFour(boolean fieldFour) {
        this.fieldFour = fieldFour;
    }

    public int[] getFieldFive() {
        return fieldFive;
    }

    public void setFieldFive(int[] fieldFive) {
        this.fieldFive = fieldFive;
    }

    public static char getFieldSix() {
        return fieldSix;
    }

    public static void setFieldSix(char fieldSix) {
        SampleClass.fieldSix = fieldSix;
    }

    public static long getFieldSeven() {
        return fieldSeven;
    }

    public static void setFieldSeven(long fieldSeven) {
        SampleClass.fieldSeven = fieldSeven;
    }

    public SampleClass(String fieldOne, double fieldTwo, int fieldThree, boolean fieldFour, int[] fieldFive) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
        this.fieldFour = fieldFour;
        this.fieldFive = fieldFive;
    }
}
