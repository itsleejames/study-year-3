public class Main {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        SampleClass sc = new SampleClass("ABC",10,25,false, intArray);
        System.out.println(ToString.toString(sc) + "\n");
    }
}
