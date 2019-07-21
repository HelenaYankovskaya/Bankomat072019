package bank;

import java.io.*;

public class Filetxt {

    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileWriter out1 = new FileWriter(fileName, true);
            try {
                out1.write(text + " ");
            } finally {
                out1.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}