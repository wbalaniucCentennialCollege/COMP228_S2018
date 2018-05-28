package Week3.Ex7;

public class PassArray {
    public static void main(String[] args) {
        // Array declaration
        int[] myArray = {1,2,3,4,5};

        // Provide feedback to the user
        System.out.printf("Effects of passing reference to entire array:%n"
            + "The values of the original array are: %n%n");

        // Iterate through the array
        // TRADITIONAL
        /*
        for(int i = 0; i < myArray.length; i++) {
            System.out.printf(" %d", myArray[i]);
        }
        */

        // ENHANCED FOR LOOP
        for(int val : myArray) {
            System.out.printf(" %d", val);
        }

        modifyArray(myArray);
        System.out.println("\nThe values of the modified array are: \n");

        for(int val : myArray) {
            System.out.printf(" %d", val);
        }

        modifyElement(myArray[3]);
        for(int val : myArray) {
            System.out.printf(" %d", val);
        }

    }

    public static void modifyArray(int[] array2) {
        // Multiply each element by 2
        // ENHANCED FOR LOOP is mainly used for READING
        /*
        for(int val : array2) {
            val *= 2;
        }
        */

        for(int i = 0; i < array2.length; i++) {
            array2[i] *= 2;
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("%nValue of element in modifyElement(): %d%n", element);
    }
}
