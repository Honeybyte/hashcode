import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputImpl implements Input {
    public InputImpl(String path) {
        // ...
//        parse()
    }

    public boolean equals(Input input) {
        return true;
    }

    public static void parse(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        while (null != (line = br.readLine())) {
            // ...
        }
        br.close();
    }
}