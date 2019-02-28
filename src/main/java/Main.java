import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputImpl input = new InputImpl("in/test.txt");

        // ...

        Output.perform("tmp/output.txt");
    }
}