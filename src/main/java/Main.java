import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Input input = Input.parse("in/test.txt");

        // ...

        Output.perform("tmp/output.txt");
    }
}