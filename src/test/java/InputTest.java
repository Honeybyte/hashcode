import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class InputTest {
    @Test
    public void parseReturnsInput() throws IOException {
        InputImpl test1 = new InputImpl("in/test.txt");
        for(VertPictureImpl t: test1.getPictures()){
            for (String s:t.getTags()) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}