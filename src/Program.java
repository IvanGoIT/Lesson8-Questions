import file.array.ArrayFileLoader;
import file.array.ArrayFileSaver;

import java.io.*;

public class Program {

    static void printArray(int[] array) {
        for(int element : array)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        int[] array = ArrayFileLoader.loadIntegers("files/load/example.txt");
        printArray(array);
        //
        int[] arrayUnlimited = ArrayFileLoader.loadUnlimitedIntegers("files/load/exampleUnlimited.txt");
        printArray(arrayUnlimited);

        //
        ArrayFileSaver.saveIntegers("files/save/array.txt", array);
        ArrayFileSaver.saveUnlimitedIntegers("files/save/arrayUnlimited.txt", arrayUnlimited);
    }
}
