package inventory.util;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static <T> void save(String file, ArrayList<T> list) {
        try {
            File folder = new File("data");
            folder.mkdirs();

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(file));

            out.writeObject(list);
            out.close();

        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> ArrayList<T> load(String file) {
        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream(file));

            ArrayList<T> list = (ArrayList<T>) in.readObject();

            in.close();
            return list;

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}