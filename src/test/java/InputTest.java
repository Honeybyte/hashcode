import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class InputTest {
    @Test
    public void parseReturnsInput() throws IOException {
        InputImpl test1 = new InputImpl("in/test.txt");
        StringBuilder VertTags = new StringBuilder();
        for(VertPictureImpl t: test1.getPictures()){
            for (String s:t.getTags()) {
                VertTags.append(s);
            }
        }
        for (SlideImpl sl:test1.getSlide()) {
            for (String s:sl.getTags())
        }
    }
}