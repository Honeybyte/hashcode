import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class InputTest {
    @Test
    public void parseReturnsInput() throws IOException {
        Input expected = new Input();

        Assert.assertTrue(expected.equals(Input.parse("in/test.txt")));
    }
}