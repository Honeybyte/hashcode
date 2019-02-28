import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    public Input() {
        // ...
    }

    public boolean equals(Input input) {
        return true;
    }

    public static Input parse(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        while (null != (line = br.readLine())) {
            // ...
        }
        br.close();

        return new Input();
    }
}