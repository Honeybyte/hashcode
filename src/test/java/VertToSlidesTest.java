import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VertToSlidesTest {
    @Test
    public void example() {
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
        p2.getTags().add("a");
        p2.getTags().add("b");
        pictures.add(p2);
        VertPicture p3 = new VertPictureImpl(3);
        p3.getTags().add("a");
        pictures.add(p3);
        VertPicture p4 = new VertPictureImpl(4);
        pictures.add(p4);

        List<Slide> slides = new VertToSlides(pictures).perform();
        for (Slide slide : slides)
            System.out.println(slide.getTags().size());
    }
}
