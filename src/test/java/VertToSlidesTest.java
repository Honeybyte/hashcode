import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VertToSlidesTest {
    @Test
    public void test1() {
        List<VertPicture> pictures = new ArrayList<>();
        VertPicture p0 = new VertPictureImpl(0);
        p0.getTags().add("a");
        p0.getTags().add("b");
        p0.getTags().add("c");
        p0.getTags().add("d");
        pictures.add(p0);
        VertPicture p1 = new VertPictureImpl(1);
        p1.getTags().add("a");
        p1.getTags().add("b");
        p1.getTags().add("c");
        pictures.add(p1);
        VertPicture p2 = new VertPictureImpl(2);
        p2.getTags().add("e");
        p2.getTags().add("f");
        pictures.add(p2);
        VertPicture p3 = new VertPictureImpl(3);
        p3.getTags().add("a");
        pictures.add(p3);
        VertPicture p4 = new VertPictureImpl(4);
        pictures.add(p4);

        Collections.sort(pictures);

        List<Slide> slides = new VertToSlides(pictures).perform();

        Assert.assertEquals(6, slides.get(0).getTags().size());
        Assert.assertEquals(3, slides.get(1).getTags().size());
    }
}
