import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class OutputTest {
    @Test
    public void createsFile() throws IOException {
        Output.createFile("tmp/output.txt");

        Assert.assertTrue(FileUtils.contentEquals(new File("examples/test.txt"), new File("tmp/output.txt")));
    }
}