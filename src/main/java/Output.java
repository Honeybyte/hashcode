import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public static void perform(String path) throws IOException {
        File file = createFile(path);
        writeToFile(file);
    }

    public static void writeToFile(File file) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//    bw.write("output");
        bw.close();
    }

    public static File createFile(String path) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();
        file.createNewFile();

        return file;
    }
}