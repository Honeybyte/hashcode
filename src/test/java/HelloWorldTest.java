import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void helloWorld() {
        assertEquals("Hello World!", "Hello " + "World!");
    }

}
