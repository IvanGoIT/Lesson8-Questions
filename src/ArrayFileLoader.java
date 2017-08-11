import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayFileLoader {
    private ArrayFileLoader(){}

    public static int[] loadIntegers(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));

        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] loadUnlimitedIntegers(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));

        String[] arrayString = sc.nextLine().split(" ");
        int[] array = new int[arrayString.length];
        for(int i = 0; i < arrayString.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }
        return array;
    }
}