package file.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ArrayFileSaver {
    private static final boolean ADD_DATA = false;

    private ArrayFileSaver(){}

    private static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        return dtf.format(localDate);
    }

    public static void saveIntegers(String fileName, int[] array) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        writer.write("" + array.length + "\n");
        for(int i = 0; i < array.length; i++) {
            writer.write("" + array[i] + " ");
        }

        if (ADD_DATA) writer.write("\n" + getCurrentDate());
        writer.flush();
        writer.close();
    }

    public static void saveUnlimitedIntegers(String fileName, int[] array) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        for(int i = 0; i < array.length; i++) {
            writer.write("" + array[i] + " ");
        }

        if (ADD_DATA) writer.write("\n" + getCurrentDate());
        writer.flush();
        writer.close();
    }
}
