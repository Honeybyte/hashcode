import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class InputTest {
    @Test
    public void parseReturnsInput() throws IOException {
        InputImpl test1 = new InputImpl("in/test.txt");
        StringBuilder VertTags = new StringBuilder();
        StringBuilder HorTags = new StringBuilder();
        for(VertPicture t: test1.getPictures()){
            for (String s:t.getTags()) {
                VertTags.append(s);
            }
        }
        for (Slide sl:test1.getSlide()) {
            for (String s:sl.getTags()){
                HorTags.append(s);
            }
        }
        String ver = VertTags.toString();
        String hor = HorTags.toString();
        Assert.assertEquals("selfiesmilegardenselfiecatfungardenmetesmile", ver);
        Assert.assertEquals("catgardenbeachcatsunbossjonassimon", hor);
    }

    @Test
    public void parseReturnsInput2() throws IOException{
        InputImpl test1 = new InputImpl("in/b_lovely_landscapes.txt");
    }
}